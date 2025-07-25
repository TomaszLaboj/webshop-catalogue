package com.example.catalogue.domain;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.catalogue.controller.model.ProductPrice;
import com.example.catalogue.domain.model.ProductEnriched;
import com.example.catalogue.domain.model.ProductRaw;
import com.example.catalogue.repository.ProductRepositoryPostgres;

@Service
public class CatalogueService {
    ProductRepositoryPostgres productRepositoryPostgres;

    @Autowired
    public CatalogueService(ProductRepositoryPostgres productRepositoryPostgres) {
        this.productRepositoryPostgres = productRepositoryPostgres;
    }

    public ProductEnriched getProductById(long id) {
        return new ProductEnriched(productRepositoryPostgres.findById(id));
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

    public ProductRaw save(ProductRaw productRaw) {
        return productRepositoryPostgres.save(productRaw).toRaw();
    }

    public ProductRaw createProduct(ProductRaw productRaw) {
        productRepositoryPostgres.save(productRaw);
        return  productRaw;
    }

    public List<ProductRaw> updatePrices(List<ProductPrice> productPrices) {
        List<ProductRaw> productRaws = productPrices.stream()
                .map((productPrice) -> updatePrice(productRepositoryPostgres.findById(productPrice.getId()))
                )
                .collect(Collectors.toList());
        return productRaws;
    }

    public ProductRaw updatePrice(ProductRaw productRaw) {
        return productRepositoryPostgres.save(productRaw).toRaw();
    };
}
