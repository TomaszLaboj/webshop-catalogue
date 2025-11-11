package com.example.catalogue.repository.category;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.catalogue.repository.category.model.CategoryEntity;

public interface JpaCategoryRepository extends CrudRepository<CategoryEntity, Long> {
    CategoryEntity findByCategoryName(String categoryName);
    CategoryEntity findByCategoryId(Long id);
    List<CategoryEntity> findAll();
}
//1. add 7 simple categories populated when app runs:
//- bakery
//- dairy
//- cupboard
//- chilled
//- fresh
//- meat & poultry
//- frozen
//
// 2. create service
//3. create controller to get categories
//4. update front end