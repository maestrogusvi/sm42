package com.ut.sm42.repository;

import com.ut.sm42.model.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findByName(String username);
}
