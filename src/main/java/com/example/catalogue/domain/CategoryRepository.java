package com.example.catalogue.domain;

import java.util.List;

import com.example.catalogue.domain.model.category.Category;

public interface CategoryRepository {
    List<Category> findAll();
    Category findByCategoryId(Long id);
    Category findByCategoryName(String name);
}
