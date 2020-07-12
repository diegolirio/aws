package br.com.lirio.appredis.infrastruture.product;

import br.com.lirio.appredis.product.domain.Product;
import br.com.lirio.appredis.product.domain.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepositoryImpl extends ProductRepository, CrudRepository<Product, String> {

    
}

