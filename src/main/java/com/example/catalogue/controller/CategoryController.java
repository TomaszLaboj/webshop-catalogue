package com.example.catalogue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.catalogue.domain.CategoryRepository;
import com.example.catalogue.domain.CategoryService;
import com.example.catalogue.domain.model.category.Category;

@RestController
public class CategoryController {

    public CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/categories")
    public List<Category> getAllCategories() {
        return categoryService.findAll();
    }

}
