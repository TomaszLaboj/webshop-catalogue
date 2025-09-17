package com.example.catalogue.domain.model;

import java.util.List;

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
    String category;

    Measure measure;
    ShelfLife shelfLife;

    float price;
    int stockAtThisPrice;

    float rating;
    List<String> dietaryIcons;
    int stockCount;

    PricePerUnit pricePerUnit;

    public ProductEnriched(ProductRaw product) {
               id = product.id;
               name = product.name;
               image =  product.image;
               category = product.category;
               measure = product.measure;
               shelfLife = product.shelfLife;
               price = product.price;
               stockAtThisPrice = product.stockAtThisPrice;
               rating = product.rating;
               dietaryIcons = product.dietaryIcons;
               stockCount = product.stockCount;
               pricePerUnit = calculatePricePerUnit(
                       product.price,
                       product.measure.measureCount(),
                       product.measure.unitOfMeasure()
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
