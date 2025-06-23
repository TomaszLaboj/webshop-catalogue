package com.example.catalogue.service;

import java.util.List;
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

    List<ProductRaw> getProducts(String name) {
        List<ProductRaw> products = catalogueRepository.findAll()
                .stream()
                .map(product -> product.toRaw())
                .collect(Collectors.toList());
        return products;
    };

}
