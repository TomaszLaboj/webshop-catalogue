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
    String categoryPath;

    Measure measure;
    ShelfLife shelfLife;

    float price;

    float rating;
    List<String> dietaryIcons;
    int stockCount;

    public ProductRaw() {};

    public ProductRaw(ProductFlatDto productFlatDto) {
        this.id = productFlatDto.getId();
        this.name = productFlatDto.getName();
        this.image = productFlatDto.getImage();
        this.categoryPath = productFlatDto.getCategoryPath();
        this.measure = new Measure(productFlatDto.getTypeOfMeasure(), productFlatDto.getMeasureCount(),productFlatDto.getUnitOfMeasure());
        this.shelfLife = new ShelfLife(productFlatDto.getShelfLifeCount(), productFlatDto.getShelfLifeUnitOfMeasure());
        this.price = productFlatDto.getPrice();
        this.rating = productFlatDto.getRating();
        this.dietaryIcons = productFlatDto.getDietaryIcons();
    }
}
