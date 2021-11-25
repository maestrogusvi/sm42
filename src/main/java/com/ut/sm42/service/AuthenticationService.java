package com.ut.sm42.service;


import com.nimbusds.jose.shaded.json.JSONObject;
import com.ut.sm42.model.User;
import org.springframework.stereotype.Service;

@Service
public interface AuthenticationService {
    JSONObject loginAuthentication (String name, String rawPassword);
    UserService createUser(User entity);
}
