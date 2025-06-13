package com.example.catalogue.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CatalogRepository  extends CrudRepository<Product, Long> {
    Product findById(long id);
    List<Product> findByName(String name);
    List<Product> findProductsByCategory(String category);
}
