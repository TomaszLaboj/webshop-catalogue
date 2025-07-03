package com.example.catalogue.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.catalogue.controller.model.ProductDto;
import com.example.catalogue.controller.model.ProductFlatDto;
import com.example.catalogue.domain.model.ProductEnriched;
import com.example.catalogue.kafka.KafkaProducer;
import com.example.catalogue.domain.CatalogueService;
import com.example.catalogue.domain.model.ProductRaw;

@RestController
public class ProductController {

    private final CatalogueService catalogueService;

    KafkaProducer kafkaProducer;

    @Autowired
    public ProductController(CatalogueService catalogueService, KafkaProducer kafkaProducer) {
        this.catalogueService = catalogueService;
        this.kafkaProducer = kafkaProducer;
    }

    @GetMapping("/products/{id}")
    public ProductDto getProductById(@PathVariable Long id) {
        return toProductDto(catalogueService.getProductById(id));
    };

    @GetMapping("/products/{name}")
    public List<ProductDto> getProductsByName(@PathVariable String name) {
        return catalogueService
                .getProductByName(name)
                .stream()
                .map(this::toProductDto)
                .collect(Collectors.toList());
    };

    @GetMapping("/products/{category}")
    public List<ProductDto> getProductByCategory(@PathVariable String category) {
        return catalogueService
                .getProductByName(category)
                .stream()
                .map(this::toProductDto)
                .collect(Collectors.toList());
    };

    @GetMapping("/products")
    public List<ProductDto> getProducts() {
        return catalogueService
                .getAllProducts()
                .stream()
                .map(this::toProductDto)
                .collect(Collectors.toList());
    };

    @PostMapping("/products/")
    public ProductFlatDto createProduct(@RequestBody ProductFlatDto productFlatDto) {
        ProductRaw productRaw = new ProductRaw()
        return productRaw;
    };

    @PutMapping("products/{id}")
    public ProductEnriched createProductEnriched(@PathVariable Long id,) {
        //increase stock number of products with the id
    }

    public ProductDto toProductDto(ProductEnriched product) {
        return ProductDto.fromDomainModel(product);
    }

}
