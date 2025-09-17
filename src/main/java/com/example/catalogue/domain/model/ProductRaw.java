package com.example.catalogue.domain.model;

import java.util.List;

import com.example.catalogue.controller.model.ProductFlatDto;

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
    String category;

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
        this.category = productFlatDto.getCategory();
        this.measure = new Measure(productFlatDto.getTypeOfMeasure(), productFlatDto.getMeasureCount(),productFlatDto.getUnitOfMeasure());
        this.shelfLife = new ShelfLife(productFlatDto.getShelfLifeCount(), productFlatDto.getShelfLifeUnitOfMeasure());
        this.price = productFlatDto.getPrice();
        this.stockAtThisPrice = productFlatDto.getStockAtThisPrice();
        this.rating = productFlatDto.getRating();
        this.dietaryIcons = productFlatDto.getDietaryIcons();
    }
}
