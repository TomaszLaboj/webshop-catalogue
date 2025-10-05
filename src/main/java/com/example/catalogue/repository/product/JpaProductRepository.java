package com.example.catalogue.repository.product;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.catalogue.repository.product.model.ProductEntity;

public interface JpaProductRepository extends CrudRepository<ProductEntity, Long> {
    ProductEntity findById(long id);
    List<ProductEntity> findByName(String name);
    List<ProductEntity> findProductsByCategory(String category);
    List<ProductEntity> findAll();
}
