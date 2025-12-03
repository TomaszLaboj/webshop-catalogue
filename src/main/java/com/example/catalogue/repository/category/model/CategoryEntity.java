package com.example.catalogue.repository.category.model;

import com.example.catalogue.domain.categoryService.model.category.Category;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long categoryId;

    @Column(name = "category_name")
    String categoryName;

    public CategoryEntity(String categoryName) {
        this.categoryName = categoryName;
    }

    public CategoryEntity() {}

    public Category toCategory() {
        return new Category(this.categoryName);
    }
}

