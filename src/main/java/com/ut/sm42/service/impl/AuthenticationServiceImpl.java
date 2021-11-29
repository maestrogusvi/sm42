package com.ut.sm42.service.impl;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.nimbusds.jose.shaded.json.JSONArray;
import com.nimbusds.jose.shaded.json.JSONObject;
import com.ut.sm42.dto.NuevoDTO;
import com.ut.sm42.exception.BusinessException;
import com.ut.sm42.model.User;
import com.ut.sm42.repository.UserRepository;
import com.ut.sm42.service.AuthenticationService;
import com.ut.sm42.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.security.interfaces.RSAPublicKey;
import java.util.Date;
import java.util.Optional;

@Service
class AuthenticationServiceImpl implements AuthenticationService {

    @Value("${spring.security.jwt.token.prefix}")
    private String tokenPrefix;

    @Value("${spring.security.jwt.expiration.time}")
    private Long expirationTime;

    @Value("${spring.security.oauth2.resourceserver.jwt.key.value}")
    private RSAPublicKey publicKey;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserService userService;

    @Override
    public JSONObject loginAuthentication(String username, String rawPassword) {
        Optional<User> user = userRepository.findByName(username);

        if (!user.isPresent()) {
            // 401 Unauthorized
            throw new BusinessException("Access is denied due to invalid credentials.", HttpStatus.UNAUTHORIZED,401);
        }

        String encodedPassword = user.get().getPassword();
        boolean isAuthenticated = passwordEncoder.matches(rawPassword, encodedPassword);

        if (!isAuthenticated) {
            // 401 Unauthorized
            throw new BusinessException("Access is denied due to invalid credentials.", HttpStatus.UNAUTHORIZED,401);
        }

        String token = JWT.create().withSubject(username)
                .withExpiresAt(new Date(System.currentTimeMillis() + expirationTime))
                .sign(Algorithm.HMAC512(publicKey.getEncoded()));

        NuevoDTO userDTO = new NuevoDTO();
        userDTO.setToken(tokenPrefix + token);
        JSONObject jsonObject = new JSONObject();
        JSONObject usuario = new JSONObject();
        jsonObject.put("permissions", new JSONArray());
        usuario.put("username", user.get().getName());
        usuario.put("role", user.get().getRole());
        jsonObject.put("user", usuario);
        jsonObject.put("token", userDTO.getToken());
        return jsonObject;
    }

    @Override
    @Transactional
    public NuevoDTO createUser(User entity) {
        NuevoDTO nuevoDTO = new NuevoDTO();
        nuevoDTO.setName(entity.getName());
        nuevoDTO.setStatus(entity.getStatus());
        nuevoDTO.setPassword(passwordEncoder.encode(entity.getPassword()));
        return (NuevoDTO) userService.saveUser(nuevoDTO);
    }


    @Bean
    public UserService nada() {
        return new UserService() {
            @Override
            public NuevoDTO saveUser(NuevoDTO nuevoDTO) {
                return nuevoDTO;}

            @Override
            public NuevoDTO save(NuevoDTO nuevoDTO) {
                return null;
            }
        };
    }

}