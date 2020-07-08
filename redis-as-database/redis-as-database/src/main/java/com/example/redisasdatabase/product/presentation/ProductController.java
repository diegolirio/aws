package com.example.redisasdatabase.product.presentation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import java.util.List;

import com.example.redisasdatabase.product.application.ProductService;
import com.example.redisasdatabase.product.domain.Product;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/products")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public List<Product> getAll() {
        return this.productService.findAll();
    }

    @PostMapping
    public Product save(@RequestBody Product product) {
        return this.productService.save(product);
    }    
    
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        this.productService.delete(id);
    }        
 
    @GetMapping("/{id}")
    public Product getById(@PathVariable String id) {
        return this.productService.findById(id).orElseThrow();
    }
    

}