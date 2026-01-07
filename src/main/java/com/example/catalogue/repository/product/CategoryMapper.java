package com.example.catalogue.repository.product;

import java.util.List;

import com.example.catalogue.domain.categoryService.model.category.Category;
import com.example.catalogue.repository.category.model.CategoryEntity;

public class CategoryMapper {

    public static Category toDomain(CategoryEntity entity) {
        if (entity == null) {
            return null;
        }

        Category category = new Category(
                entity.getCategoryId(),
                entity.getCategoryName()
        );

        if (entity.getSubcategories() != null) {
            List<Category> children = entity.getSubcategories()
                    .stream()
                    .map(CategoryMapper::toDomain)
                    .toList();
            category.setSubcategories(children);
        }

        return category;
    }
}