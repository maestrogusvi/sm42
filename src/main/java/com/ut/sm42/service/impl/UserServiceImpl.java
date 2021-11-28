package com.ut.sm42.service.impl;

import com.ut.sm42.dto.UserDTO;
import com.ut.sm42.model.User;
import com.ut.sm42.repository.UserRepository;
import com.ut.sm42.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        user.setStatus(userDTO.getStatus());
        user.setPassword(userDTO.getPassword());
        user.setRole(Short.valueOf(userDTO.getRole()));
        userRepository.save(user);
        return null;
    }
}