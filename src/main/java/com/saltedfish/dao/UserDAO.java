package com.saltedfish.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saltedfish.pojo.User;

public interface UserDAO extends JpaRepository<User,Integer>{

    User findByName(String name);

    User getByNameAndPassword(String name, String password);

}