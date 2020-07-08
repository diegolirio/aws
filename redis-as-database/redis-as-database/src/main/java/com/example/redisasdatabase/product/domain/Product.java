package com.example.redisasdatabase.product.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@RedisHash("productss")
public class Product {

    @Id
    private String id;
	private String name;
	
    public List<Product> findAll(ProductRepository productRepository) {
		return productRepository.findAll();
	}

	public Product save(ProductRepository productRepository) {
		return productRepository.save(this);
	}


	public Optional<Product> findById(ProductRepository productRepository) {
		return productRepository.findById(this.id);
	}

	public void delete(ProductRepository productRepository) {
		productRepository.delete(this);
	}

}
