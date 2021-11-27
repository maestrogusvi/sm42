package com.ut.sm42.service;

import com.ut.sm42.dto.nuevoDTO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    nuevoDTO saveUser(nuevoDTO userDTO);
}
