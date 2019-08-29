package com.saltedfish.es;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.saltedfish.pojo.Product;

public interface ProductESDAO extends ElasticsearchRepository<Product,Integer>{

}