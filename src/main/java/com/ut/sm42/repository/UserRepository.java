package com.ut.sm42.repository;

import com.ut.sm42.model.User;
//profe aqui no le supimos muy bien no entendimos vimos la clase 10 veces
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}

