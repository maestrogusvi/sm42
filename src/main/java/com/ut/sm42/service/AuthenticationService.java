package com.ut.sm42.service;

import com.nimbusds.jose.shaded.json.JSONObject;
import com.ut.sm42.dto.UserDTO;
import com.ut.sm42.model.User;
import org.springframework.stereotype.Service;

@Service
public interface AuthenticationService {
    JSONObject loginAuthentication(String username, String rawPassword);
    UserDTO createUser(User entity);
}
