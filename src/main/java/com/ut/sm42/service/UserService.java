package com.ut.sm42.service;

import com.ut.sm42.dto.UserDTO;
import com.ut.sm42.model.User;
import org.springframework.stereotype.Service;


@Service
public interface UserService {
    UserDTO saveUser(UserDTO userDTO);
}
