package br.com.lirio.appredis.product.infrastructure;

import br.com.lirio.appredis.product.domain.Product;
import br.com.lirio.appredis.product.domain.ProductRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepositoryImpl extends ProductRepository, CrudRepository<Product, String> {

    
}