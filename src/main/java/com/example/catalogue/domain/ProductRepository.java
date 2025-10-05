package com.example.catalogue.domain;

import java.util.List;

import com.example.catalogue.domain.model.ProductEnriched;
import com.example.catalogue.domain.model.ProductRaw;
import com.example.catalogue.repository.product.model.ProductEntity;


public interface ProductRepository {

    ProductRaw findById(long id);
    List<ProductEnriched> findByName(String name);
    List<ProductEnriched> findProductsByCategory(String category);
    List<ProductEnriched> findAll();
    ProductEntity save(ProductRaw productRaw);
    ProductRaw updateStock(Long id, int stockQuantity);
}
