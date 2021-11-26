package com.ut.sm42.service;

import com.ut.sm42.dto.UserDTO;
import com.ut.sm42.model.User;
import org.springframework.transaction.annotation.Transactional;

public interface AuthenticationService {
    @Transactional
    UserDTO createUser(User entity);
}
