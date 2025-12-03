package com.example.catalogue.controller.productController;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.catalogue.controller.productController.model.ProductDto;
import com.example.catalogue.controller.productController.model.ProductFlatDto;
import com.example.catalogue.domain.productService.model.product.ProductEnriched;
import com.example.catalogue.domain.productService.CatalogueService;
import com.example.catalogue.domain.productService.model.product.ProductPrice;
import com.example.catalogue.domain.productService.model.product.ProductRaw;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
public class ProductController {

    private final CatalogueService catalogueService;

    @Autowired
    public ProductController(CatalogueService catalogueService) {
        this.catalogueService = catalogueService;
    }

    @GetMapping("/products")
    public List<ProductDto> getProducts() throws JsonProcessingException {
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

    @GetMapping(value="/products", params="categoryId")
    public List<ProductDto> getProductsByCategory(@RequestParam("categoryId") Long categoryId) {
        return catalogueService
                .getProductsByCategory(categoryId)
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
