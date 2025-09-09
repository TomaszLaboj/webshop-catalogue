package com.example.catalogue.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.catalogue.controller.model.ProductDto;
import com.example.catalogue.controller.model.ProductFlatDto;
import com.example.catalogue.domain.model.ProductEnriched;
import com.example.catalogue.domain.CatalogueService;
import com.example.catalogue.domain.model.ProductPrice;
import com.example.catalogue.domain.model.ProductRaw;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
public class ProductController {

    private final CatalogueService catalogueService;

    @Autowired
    public ProductController(CatalogueService catalogueService) {
        this.catalogueService = catalogueService;
    }

    @GetMapping("/products")
    public List<ProductDto> getProducts() {
        return catalogueService
                .getAllProducts()
                .stream()
                .map(this::toProductDto)
                .collect(Collectors.toList());
    };

    @PostMapping("/products")
    public ProductRaw createProduct(@RequestBody ProductFlatDto productDto) {
        ProductRaw productRaw = new ProductRaw(productDto);
        return catalogueService.createProduct(productRaw);
    }

    @GetMapping(value="/products", params="id")
    public ProductDto getProductById(@RequestParam("id") Long id) {
        return toProductDto(catalogueService.getProductById(id));
    };

    @GetMapping(value="/products", params="name")
    public List<ProductDto> getProductsByName(@RequestParam("name") String name) {
        return catalogueService
                .getProductByName(name)
                .stream()
                .map(this::toProductDto)
                .collect(Collectors.toList());
    };

    @GetMapping(value="/products", params="category")
    public List<ProductDto> getProductByCategory(@RequestParam("category") String category) {
        return catalogueService
                .getProductByName(category)
                .stream()
                .map(this::toProductDto)
                .collect(Collectors.toList());
    };

    @PutMapping(value="/products/add-stock")
    public ProductRaw updateProductStock(@RequestBody ProductPrice productStockQuantity) throws JsonProcessingException {
        return catalogueService.updateStock(productStockQuantity);
    }

    public ProductDto toProductDto(ProductEnriched product) {
        return ProductDto.fromDomainModel(product);
    }

}
