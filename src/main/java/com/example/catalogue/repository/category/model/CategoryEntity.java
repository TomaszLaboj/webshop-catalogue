package com.example.catalogue.repository.category.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class CategoryEntity {
    Long categoryId;
    String categoryName;
}

