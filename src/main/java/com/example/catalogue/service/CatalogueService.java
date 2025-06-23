package com.example.catalogue.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.catalogue.repository.CatalogueRepository;
import com.example.catalogue.repository.ProductRaw;

@Service
public class CatalogueService {
    CatalogueRepository catalogueRepository;

    @Autowired
    public CatalogueService(CatalogueRepository catalogueRepository) {
        this.catalogueRepository = catalogueRepository;
    }

    ProductRaw getProductById(Long id) {
        return catalogueRepository.findById(id).isPresent() ? catalogueRepository.findById(id).get().toRaw() : null;
    };

    List<ProductRaw> getProductByName(String name) {
        List<ProductRaw> products = catalogueRepository.findProductsByCategory(name)
                .stream()
                .map(product -> product.toRaw())
                .collect(Collectors.toList());
        return products;
    }
    List<ProductRaw> getAllProducts() {
        List<ProductRaw> products = catalogueRepository.findAll()
                .stream()
                .map(product -> product.toRaw())
                .collect(Collectors.toList());
        return products;
    };

    List<ProductRaw> getProductsByCategory(String category) {
        List<ProductRaw> products = catalogueRepository.findProductsByCategory(category)
                .stream()
                .map(product -> product.toRaw())
                .collect(Collectors.toList());
        return products;
    };

}
