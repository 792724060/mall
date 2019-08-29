package com.saltedfish.dao;
 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saltedfish.pojo.Product;
import com.saltedfish.pojo.Review;

public interface ReviewDAO extends JpaRepository<Review,Integer>{

	List<Review> findByProductOrderByIdDesc(Product product);
	int countByProduct(Product product);

}