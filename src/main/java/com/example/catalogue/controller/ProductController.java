package com.example.catalogue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.catalogue.kafka.KafkaProducer;
import com.example.catalogue.repository.CatalogRepository;
import com.example.catalogue.repository.Product;

@RestController
public class ProductController {

    CatalogRepository catalogRepository;

    KafkaProducer kafkaProducer;

    @Autowired
    public ProductController(CatalogRepository catalogRepository, KafkaProducer kafkaProducer) {
        this.catalogRepository = catalogRepository;
        this.kafkaProducer = kafkaProducer;
    }

    @GetMapping("/{name}")
    public List<Product> getProduct(@PathVariable String name) {
        return catalogRepository.findByName(name);
    }

}
