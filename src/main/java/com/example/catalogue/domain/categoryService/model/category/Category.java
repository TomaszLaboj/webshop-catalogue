package com.example.catalogue.domain.categoryService.model.category;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category {
    private Long categoryId;
    private String categoryName;

    public Category(Long id, String name) {
        this.categoryId = id;
        this.categoryName = name;
    }

    public Category(String name) {
        this.categoryName = name;
    }
}
