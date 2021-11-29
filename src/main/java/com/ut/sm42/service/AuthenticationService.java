package com.ut.sm42.service;

import com.nimbusds.jose.shaded.json.JSONObject;
import com.ut.sm42.dto.NuevoDTO;
import com.ut.sm42.model.User;
import org.springframework.stereotype.Service;

@Service
public interface AuthenticationService {
    /**
     *
     * @param username
     * @param rawPassword
     * @return
     */
    JSONObject loginAuthentication(String username, String rawPassword);
    NuevoDTO createUser(User entity);
}