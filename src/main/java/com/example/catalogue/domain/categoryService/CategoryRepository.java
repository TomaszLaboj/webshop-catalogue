package com.example.catalogue.domain.categoryService;

import java.util.List;

import com.example.catalogue.domain.categoryService.model.category.Category;
import com.example.catalogue.repository.category.model.CategoryEntity;

public interface CategoryRepository {
    List<Category> listCategories();
    void createCategory(Category category);
}
