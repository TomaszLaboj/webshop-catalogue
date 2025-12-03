package com.example.catalogue.domain.productService;

import java.util.List;

import com.example.catalogue.domain.productService.model.product.ProductEnriched;
import com.example.catalogue.domain.productService.model.product.ProductRaw;
import com.example.catalogue.repository.product.model.ProductEntity;


public interface ProductRepository {

    ProductRaw findById(long id);
    List<ProductEnriched> findByName(String name);
    List<ProductEnriched> findProductsByCategoryId(Long categoryId);
    List<ProductEnriched> findAll();
    ProductEntity save(ProductRaw productRaw);
    ProductRaw updateStock(Long id, int stockQuantity);
}
