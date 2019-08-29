package com.saltedfish.dao;
 

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saltedfish.pojo.Product;
import com.saltedfish.pojo.Property;
import com.saltedfish.pojo.PropertyValue;

public interface PropertyValueDAO extends JpaRepository<PropertyValue,Integer>{

	List<PropertyValue> findByProductOrderByIdDesc(Product product);
	PropertyValue getByPropertyAndProduct(Property property, Product product);

	
	
	
}