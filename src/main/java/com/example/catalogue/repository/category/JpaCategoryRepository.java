package com.example.catalogue.repository.category;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.catalogue.repository.category.model.CategoryEntity;

public interface JpaCategoryRepository extends JpaRepository<CategoryEntity, Long> {
}
