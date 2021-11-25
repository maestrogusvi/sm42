package com.ut.sm42.service;


import com.nimbusds.jose.shaded.json.JSONObject;
import com.ut.sm42.dto.UserDTO;
import com.ut.sm42.model.User;

public interface AuthenticationService {
    JSONObject loginAuthentication (String name, String pwd);
    UserDTO createUser(User user);
}
