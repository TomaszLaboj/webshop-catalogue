package com.example.catalogue.repository.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.catalogue.domain.categoryService.CategoryRepository;
import com.example.catalogue.domain.categoryService.model.category.Category;
import com.example.catalogue.repository.category.model.CategoryEntity;

@Repository
public class CategoryRepositoryPostgres implements CategoryRepository {

    public final JpaCategoryRepository jpaCategoryRepository;

    @Autowired
    public CategoryRepositoryPostgres(JpaCategoryRepository jpaCategoryRepository) {
        this.jpaCategoryRepository = jpaCategoryRepository;
    }

    public List<Category> listCategories() {
        List<CategoryEntity> categoryEntities = jpaCategoryRepository.findAll();
        return categoryEntities.stream().map((CategoryEntity category) -> new Category(category.getCategoryId(), category.getCategoryName())).toList();
    }

    public void createCategory(Category category) {
        jpaCategoryRepository.save(new CategoryEntity(category.getCategoryName()));
    }

    public CategoryEntity getCategoryById(Long id) {
        return jpaCategoryRepository.findById(id).get();
    }
}
