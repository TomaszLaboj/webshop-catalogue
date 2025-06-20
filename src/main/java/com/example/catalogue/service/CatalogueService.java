package com.example.catalogue.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.catalogue.repository.CatalogueRepository;
import com.example.catalogue.repository.ProductEntity;

@Service
public class CatalogueService {
    CatalogueRepository catalogueRepository;

    @Autowired
    public CatalogueService(CatalogueRepository catalogueRepository) {
        this.catalogueRepository = catalogueRepository;
    }

    List<ProductRaw> getProducts(String name) {
        List<ProductRaw> products = catalogueRepository.findByName(name)
                .stream()
                .map(product -> mapProductEntityToProductRaw(product))
                .collect(Collectors.toList());
        return products;
    };

    ProductRaw mapProductEntityToProductRaw(ProductEntity productEntity) {
        return new ProductRaw(
                productEntity.getId(),
                productEntity.getName(),
                productEntity.getImage(),
                productEntity.getCategoryPath(),
                new Measure(
                        productEntity.getMeasure(),
                        productEntity.getMeasureCount(),
                        productEntity.getUnitOfMeasure()
                ),
                new ShelfLife(
                        productEntity.getShelfLifeCount(),
                        productEntity.getShelfLifeUnit()
                ),
                productEntity.getPrice(),
                productEntity.getRating(),
                productEntity.getDietaryIcons(),
                productEntity.getStockCount()
        );
    }
}
