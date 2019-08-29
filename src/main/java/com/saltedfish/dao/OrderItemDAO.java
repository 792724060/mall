package com.saltedfish.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saltedfish.pojo.Order;
import com.saltedfish.pojo.OrderItem;
import com.saltedfish.pojo.Product;
import com.saltedfish.pojo.User;

public interface OrderItemDAO extends JpaRepository<OrderItem,Integer>{
	List<OrderItem> findByOrderOrderByIdDesc(Order order);
	List<OrderItem> findByProduct(Product product);
	List<OrderItem> findByUserAndOrderIsNull(User user);
}