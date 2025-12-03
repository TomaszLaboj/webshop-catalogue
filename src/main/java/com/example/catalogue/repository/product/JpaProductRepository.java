package com.example.catalogue.repository.product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.catalogue.repository.product.model.ProductEntity;

public interface JpaProductRepository extends JpaRepository<ProductEntity, Long> {
    ProductEntity findById(long id);
    List<ProductEntity> findByName(String name);
    List<ProductEntity> findByCategory_CategoryId(Long categoryId);
    List<ProductEntity> findAll();
}
