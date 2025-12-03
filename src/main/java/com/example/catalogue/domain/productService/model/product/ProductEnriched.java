package com.example.catalogue.domain.productService.model.product;

import java.util.List;

import com.example.catalogue.domain.categoryService.model.category.Category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProductEnriched {
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

    PricePerUnit pricePerUnit;

    public ProductEnriched(ProductRaw product) {
               id = product.getId();
               name = product.getName();
               image =  product.getImage();
               category = product.getCategory();
               measure = product.getMeasure();
               shelfLife = product.getShelfLife();
               price = product.getPrice();
               stockAtThisPrice = product.getStockAtThisPrice();
               rating = product.getRating();
               dietaryIcons = product.getDietaryIcons();
               stockCount = product.getStockCount();
               pricePerUnit = calculatePricePerUnit(
                       product.getPrice(),
                       product.getMeasure().measureCount(),
                       product.getMeasure().unitOfMeasure()
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
