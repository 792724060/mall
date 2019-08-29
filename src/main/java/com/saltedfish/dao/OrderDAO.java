package com.saltedfish.dao;
 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saltedfish.pojo.Order;
import com.saltedfish.pojo.User;

public interface OrderDAO extends JpaRepository<Order,Integer>{
    public List<Order> findByUserAndStatusNotOrderByIdDesc(User user, String status);
}
