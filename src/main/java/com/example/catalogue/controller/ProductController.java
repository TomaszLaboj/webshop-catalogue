package com.example.catalogue.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.catalogue.kafka.KafkaProducer;
import com.example.catalogue.repository.Measure;
import com.example.catalogue.repository.PricePerUnit;
import com.example.catalogue.repository.ProductEntity;
import com.example.catalogue.repository.ShelfLife;
import com.example.catalogue.service.CatalogueService;
import com.example.catalogue.repository.ProductRaw;

@RestController
public class ProductController {

    private final CatalogueService catalogueService;

    KafkaProducer kafkaProducer;

    @Autowired
    public ProductController(CatalogueService catalogueService, KafkaProducer kafkaProducer) {
        this.catalogueService = catalogueService;
        this.kafkaProducer = kafkaProducer;
    }

    @GetMapping("/products")
    public List<ProductDto> getProducts() {
        List<ProductDto> productsDto = catalogueService
                .getAllProducts()
                .stream()
                .map(product -> toProductDto(product))
                .collect(Collectors.toList());
        return productsDto;
    };

//    @GetMapping("/products/{id}")
//    public List<ProductDto> getProduct(@PathVariable Long id) {
//
//    };
//
//    @GetMapping("/products/{name}")
//    public List<ProductDto> getProduct(@PathVariable String name) {};
//
//    @GetMapping("/products/{category}")
//    public List<ProductDto> getProductByCategory(@PathVariable String category) {};
//
//    @PostMapping("/products")
//    public ProductRaw createProduct(@RequestBody ProductEntity product) {};

    public ProductDto toProductDto(ProductRaw productRaw) {
        return new ProductDto(
                productRaw.getId(),
                productRaw.getName(),
                productRaw.getImage(),
                productRaw.getCategoryPath(),
                new Measure(
                        productRaw.getMeasure().measureType(),
                        productRaw.getMeasure().measureCount(),
                        productRaw.getMeasure().unitOfMeasure()
                ),
                new ShelfLife(
                        productRaw.getShelfLife().shelfLifeCount(),
                        productRaw.getShelfLife().shelfLifeUnit()
                ),
                productRaw.getPrice(),
                calculatePricePerUnit(
                        productRaw.getPrice(),
                        productRaw.getMeasure().measureCount(),
                        productRaw.getMeasure().unitOfMeasure()
                ),
                productRaw.getRating(),
                productRaw.getDietaryIcons(),
                productRaw.getStockCount()
        );
    }

    PricePerUnit calculatePricePerUnit(float price, int measureCount, String unitOfMeasure) {
        float pricePerUnit = 0;
        int unitCount = 0;

            if (unitOfMeasure.toLowerCase().equals("kg") || unitOfMeasure.toLowerCase().equals("l")) {
            pricePerUnit = price / measureCount;
                unitCount = 1;
            }
            else if (unitOfMeasure.toLowerCase().equals("g") || unitOfMeasure.toLowerCase().equals("ml")) {
                pricePerUnit = price / measureCount * 100;
                unitCount = 100;
            }
        return new PricePerUnit(pricePerUnit, unitCount, unitOfMeasure);
    }
}

// 15.70;   350g, 100g =
