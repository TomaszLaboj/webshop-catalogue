package com.example.catalogue.domain.productService.model.product;

import java.util.List;

import com.example.catalogue.controller.productController.model.ProductFlatDto;
import com.example.catalogue.domain.categoryService.model.category.Category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProductRaw {
    Long id;

    String name;
    String image;
    Category category;

    Measure measure;
    ShelfLife shelfLife;

    float price;
    int stockAtThisPrice;

    float rating;
    List<String> dietaryIcons;
    int stockCount;

    public ProductRaw() {};

    public ProductRaw(ProductFlatDto productFlatDto) {
        this.id = productFlatDto.getId();
        this.name = productFlatDto.getName();
        this.image = productFlatDto.getImage();
        this.category = new Category(productFlatDto.getId(), productFlatDto.getName());
        this.measure = new Measure(productFlatDto.getNumberOfItemsInPack(), productFlatDto.getTypeOfMeasure(), productFlatDto.getMeasureCount(),productFlatDto.getUnitOfMeasure());
        this.shelfLife = new ShelfLife(productFlatDto.getShelfLifeCount(), productFlatDto.getShelfLifeUnitOfMeasure());
        this.price = productFlatDto.getPrice();
        this.stockAtThisPrice = productFlatDto.getStockAtThisPrice();
        this.rating = productFlatDto.getRating();
        this.dietaryIcons = productFlatDto.getDietaryIcons();
    }
}
