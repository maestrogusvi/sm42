package com.ut.sm42.service.impl;

import com.ut.sm42.dto.NuevoDTO;
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
    public NuevoDTO saveUser(NuevoDTO nuevoDTO) {
        User user = new User();
        user.setName(nuevoDTO.getName());
        user.setStatus(nuevoDTO.getStatus());
        user.setPassword(nuevoDTO.getPassword());
        user.setRole(Short.valueOf(nuevoDTO.getRole()));
        userRepository.save(user);
        return null;
        }
    }


