package com.example.catalogue.repository.category;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.catalogue.domain.CategoryRepository;
import com.example.catalogue.domain.model.category.Category;
import com.example.catalogue.repository.category.model.CategoryEntity;

@Repository
public class CategoryRepositoryPostgres implements CategoryRepository {

    public final JpaCategoryRepository jpaCategoryRepository;

    @Autowired
    public CategoryRepositoryPostgres(JpaCategoryRepository jpaCategoryRepository) {
        this.jpaCategoryRepository = jpaCategoryRepository;
    }

    public List<Category> findAll() {
        List<CategoryEntity> categoryEntities = jpaCategoryRepository.findAll();
        List<Category> categoryList = new ArrayList<>();
        for (CategoryEntity categoryEntity : categoryEntities) {
            categoryList.add(new Category(categoryEntity.getCategoryId(), categoryEntity.getCategoryName()));
        }
        return categoryList;
    }

    public Category findByCategoryId(Long id) {
        Optional<CategoryEntity> categoryOptional = jpaCategoryRepository.findById(id);
        CategoryEntity category;
        if (categoryOptional.isPresent()) {
            category = categoryOptional.get();
            return new Category(category.getCategoryId(), category.getCategoryName());
        }
        return null;
    }

    public Category findByCategoryName(String categoryName) {
        CategoryEntity categoryEntity = jpaCategoryRepository.findByCategoryName(categoryName);
        return new Category(categoryEntity.getCategoryId(), categoryEntity.getCategoryName());
    }


}
