package com.ut.sm42.service;

import com.nimbusds.jose.shaded.json.JSONObject;
import com.ut.sm42.dto.UserDTO;
import com.ut.sm42.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public interface AuthenticationService {

    /**
     *
     * @param username
     * @param pwd
     * @return
     */

    public JSONObject loginAuthentication(String username, String pwd);

    /**
     *Generar un registro nuevo en la tabla de usuario
     *
     * @param user
     * @return
     */

    public UserDTO createUser(User user);
}