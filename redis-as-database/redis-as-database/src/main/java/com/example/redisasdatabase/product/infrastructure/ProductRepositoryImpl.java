package com.example.redisasdatabase.product.infrastructure;

import com.example.redisasdatabase.product.domain.Product;
import com.example.redisasdatabase.product.domain.ProductRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepositoryImpl extends ProductRepository, CrudRepository<Product, String> {

    
}