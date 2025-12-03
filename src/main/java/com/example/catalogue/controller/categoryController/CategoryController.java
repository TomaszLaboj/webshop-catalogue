package com.example.catalogue.controller.categoryController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.catalogue.controller.categoryController.model.CategoryDto;
import com.example.catalogue.domain.categoryService.CategoryService;
import com.example.catalogue.domain.categoryService.model.category.Category;

@RestController
public class CategoryController {

    public CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/categories")
    public List<Category> getAllCategories() {
        return categoryService.listCategories();
    }

    @PostMapping("/categories")
    public Category createCategory(@RequestBody CategoryDto category) {
        return categoryService.createCategory(category);
    }

}
