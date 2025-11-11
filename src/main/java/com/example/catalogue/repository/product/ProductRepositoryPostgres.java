package com.example.catalogue.repository.product;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.catalogue.domain.ProductRepository;
import com.example.catalogue.domain.model.product.ProductEnriched;
import com.example.catalogue.domain.model.product.ProductRaw;
import com.example.catalogue.repository.product.model.ProductEntity;

@Repository
public class ProductRepositoryPostgres implements ProductRepository {
    private final JpaProductRepository jpaRepository;

    @Autowired
    public ProductRepositoryPostgres(JpaProductRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    public ProductRaw findById(long id) {
        return jpaRepository.findById(id).toRaw();
    };

    public List<ProductEnriched> findByName(String name) {
        return jpaRepository.findByName(name)
                .stream()
                .map(ProductEntity::toRaw)
                .map(productRaw -> new ProductEnriched(productRaw))
                .collect(Collectors.toList());
    }

    public List<ProductEnriched> findProductsByCategory(String category) {
        return jpaRepository.findProductsByCategory(category)
                .stream()
                .map(ProductEntity::toRaw)
                .map(productRaw -> new ProductEnriched(productRaw))
                .collect(Collectors.toList());
    }

    public List<ProductEnriched> findAll() {
        return jpaRepository.findAll()
                .stream()
                .map(ProductEntity::toRaw)
                .map(productRaw -> new ProductEnriched(productRaw))
                .collect(Collectors.toList());
    };

    public ProductEntity save(ProductRaw productRaw) {
        ProductEntity productEntity = new ProductEntity(productRaw);
        ProductEntity createdProduct = jpaRepository.save(productEntity);
        return createdProduct;
    }

    public ProductRaw updateStock(Long id, int stockQuantity) {
        Optional<ProductEntity> productEntity = jpaRepository.findById(id);
        ProductEntity product;
        if (productEntity.isPresent()) {
            product = productEntity.get();
            product.setStockCount(product.getStockCount() + stockQuantity);
            return jpaRepository.save(product).toRaw();
        }
        return null;
    }

}
