package com.ut.sm42.service;

import com.ut.sm42.dto.NuevoDTO;
import com.ut.sm42.dto.user.UserDTO;

import org.springframework.stereotype.Service;


@Service
public interface UserService {
    NuevoDTO saveUser(NuevoDTO nuevoDTO);

    NuevoDTO save(NuevoDTO nuevoDTO);
}