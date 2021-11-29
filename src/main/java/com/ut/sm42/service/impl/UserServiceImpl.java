package com.ut.sm42.service.impl;

import com.ut.sm42.dto.UserDTO;
import com.ut.sm42.model.User;
import com.ut.sm42.repository.UserRepository;
import com.ut.sm42.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        user.setRole(Short.valueOf(userDTO.getRole()));
        user.setPassword(user.getPassword());
        userRepository.save(user);
        return userDTO;
    }
}