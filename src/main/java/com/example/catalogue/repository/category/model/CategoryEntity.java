package com.example.catalogue.repository.category.model;

import jakarta.persistence.Entity;
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
    Long categoryId;
    String categoryName;

    public CategoryEntity() {

    }
}

