package com.example.catalogue.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.catalogue.domain.model.ProductEnriched;
import com.example.catalogue.repository.ProductRepositoryPostgres;

@Service
public class CatalogueService {
    ProductRepositoryPostgres productRepositoryPostgres;

    @Autowired
    public CatalogueService(ProductRepositoryPostgres productRepositoryPostgres) {
        this.productRepositoryPostgres = productRepositoryPostgres;
    }

    public ProductEnriched getProductById(long id) {
        return productRepositoryPostgres.findById(id);
    };

    public List<ProductEnriched> getProductByName(String name) {
        return productRepositoryPostgres.findByName(name);
    }

    public List<ProductEnriched> getProductsByCategory(String category) {
        return productRepositoryPostgres.findProductsByCategory(category);
    };

    public List<ProductEnriched> getAllProducts() {
        return productRepositoryPostgres.findAll();
    };
}
