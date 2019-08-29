package com.saltedfish.dao;
 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saltedfish.pojo.Product;
import com.saltedfish.pojo.ProductImage;

public interface ProductImageDAO extends JpaRepository<ProductImage,Integer>{
	public List<ProductImage> findByProductAndTypeOrderByIdDesc(Product product, String type);
	
}