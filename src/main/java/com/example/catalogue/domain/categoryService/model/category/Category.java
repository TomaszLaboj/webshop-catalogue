package com.example.catalogue.domain.categoryService.model.category;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category {
    private Long categoryId;
    private String categoryName;
    private List<Category> subcategories;

    public Category(Long id, String name) {
        this.categoryId = id;
        this.categoryName = name;
    }

    public Category(Long id, String name, List<Category> subcategories) {
        this.categoryId = id;
        this.categoryName = name;
        this.subcategories = subcategories;
    }

    public Category(String name) {
        this.categoryName = name;
    }
}
