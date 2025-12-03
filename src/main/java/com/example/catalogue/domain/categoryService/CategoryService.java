package com.example.catalogue.domain.categoryService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.catalogue.controller.categoryController.model.CategoryDto;
import com.example.catalogue.domain.categoryService.model.category.Category;
import com.example.catalogue.repository.category.CategoryRepositoryPostgres;

@Service
public class CategoryService {

    private CategoryRepositoryPostgres categoryRepository;

    @Autowired
    public CategoryService(CategoryRepositoryPostgres categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> listCategories() {
        return categoryRepository.listCategories();
    }

    public Category createCategory(CategoryDto categoryDto) {
       Category category = new Category(categoryDto.getCategoryName());
         categoryRepository.createCategory(category);
         return category;
    }
}
