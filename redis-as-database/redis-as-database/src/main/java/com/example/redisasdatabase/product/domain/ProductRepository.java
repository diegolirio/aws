package com.example.redisasdatabase.product.domain;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

	List<Product> findAll();

	Product save(Product product);

	void deleteById(String id);

	void delete(Product product);

	Optional<Product> findById(String id);

}