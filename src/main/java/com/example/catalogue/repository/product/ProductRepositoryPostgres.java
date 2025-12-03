package com.example.catalogue.repository.product;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.catalogue.domain.productService.ProductRepository;
import com.example.catalogue.domain.productService.model.product.ProductEnriched;
import com.example.catalogue.domain.productService.model.product.ProductRaw;
import com.example.catalogue.repository.category.CategoryRepositoryPostgres;
import com.example.catalogue.repository.category.model.CategoryEntity;
import com.example.catalogue.repository.product.model.ProductEntity;

@Repository
public class ProductRepositoryPostgres implements ProductRepository {

    private final JpaProductRepository jpaProductRepository;
    private CategoryRepositoryPostgres categoryRepository;

    @Autowired
    public ProductRepositoryPostgres(JpaProductRepository jpaRepository,  CategoryRepositoryPostgres categoryRepository) {
        this.jpaProductRepository = jpaRepository;
        this.categoryRepository = categoryRepository;
    }

    public ProductRaw findById(long id) {
        return jpaProductRepository.findById(id).toRaw();
    };

    public List<ProductEnriched> findByName(String name) {
        return jpaProductRepository.findByName(name)
                .stream()
                .map(ProductEntity::toRaw)
                .map(productRaw -> new ProductEnriched(productRaw))
                .collect(Collectors.toList());
    }

    public List<ProductEnriched> findProductsByCategoryId(Long categoryId) {
        return jpaProductRepository.findByCategory_CategoryId(categoryId)
                .stream()
                .map(ProductEntity::toRaw)
                .map(productRaw -> new ProductEnriched(productRaw))
                .collect(Collectors.toList());
    }

    public List<ProductEnriched> findAll() {
        return jpaProductRepository.findAll()
                .stream()
                .map(ProductEntity::toRaw)
                .map(productRaw -> new ProductEnriched(productRaw))
                .collect(Collectors.toList());
    };

    public ProductEntity save(ProductRaw productRaw) {
        ProductEntity productEntity = new ProductEntity(productRaw);
        CategoryEntity categoryEntity = categoryRepository.getCategoryById(productRaw.getCategory().getCategoryId());
        productEntity.setCategory(categoryEntity);
        ProductEntity createdProduct = jpaProductRepository.save(productEntity);
        return createdProduct;
    }

    public ProductRaw updateStock(Long id, int stockQuantity) {
        Optional<ProductEntity> productEntity = jpaProductRepository.findById(id);
        ProductEntity product;
        if (productEntity.isPresent()) {
            product = productEntity.get();
            product.setStockCount(product.getStockCount() + stockQuantity);
            return jpaProductRepository.save(product).toRaw();
        }
        return null;
    }

}
