package com.example.redisasdatabase.product.application;

import java.util.List;
import java.util.Optional;

import com.example.redisasdatabase.product.domain.Product;
import com.example.redisasdatabase.product.domain.ProductRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

public interface ProductService {

	List<Product> findAll();

	Product save(Product product);

	void delete(String id);

	Optional<Product> findById(String id);

}

@Service
@RequiredArgsConstructor
class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return new Product().findAll(productRepository);
    }

    @Override
    public Product save(Product product) {
        return product.save(productRepository);
    }

    @Override
    public void delete(String id) {
        this.findById(id)
            .orElseThrow()
            .delete(productRepository);
    }

    @Override
    public Optional<Product> findById(String id) {
        return Product.builder()
            .id(id)
            .build()
            .findById(productRepository);
    }

}
