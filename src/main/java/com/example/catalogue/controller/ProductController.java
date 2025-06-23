package com.example.catalogue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.catalogue.kafka.KafkaProducer;
import com.example.catalogue.repository.ProductEntity;
import com.example.catalogue.service.CatalogueService;
import com.example.catalogue.repository.ProductRaw;

@RestController
public class ProductController {

    CatalogueService catalogueService;

    KafkaProducer kafkaProducer;

    @Autowired
    public ProductController(CatalogueService catalogueService, KafkaProducer kafkaProducer) {
        this.catalogueService = catalogueService;
        this.kafkaProducer = kafkaProducer;
    }

    @GetMapping("/products")
    public List<ProductDto> getProducts() {

    };

    @GetMapping("/products/{name}")
    public List<ProductDto> getProduct(@PathVariable String name) {};

    @GetMapping("/products/{category}")
    public List<ProductDto> getProductByCategory(@PathVariable String category) {};

    @PostMapping("/products")
    public ProductRaw createProduct(@RequestBody ProductEntity product) {};

}
