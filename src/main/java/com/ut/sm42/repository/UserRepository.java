package com.ut.sm42.repository;

import com.ut.sm42.model.User2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User2, Integer> {

    Optional<User2> findByName(String username);
}