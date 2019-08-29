package com.saltedfish.dao;
 
import org.springframework.data.jpa.repository.JpaRepository;

import com.saltedfish.pojo.Category;

public interface CategoryDAO extends JpaRepository<Category,Integer>{

}
