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
                       product.getMeasure().numberOfItemsInPack(),
                       product.getPrice(),
                       product.getMeasure().measureCount(),
                       product.getMeasure().unitOfMeasure()
               );
    }

    PricePerUnit calculatePricePerUnit(int numberOfItemsInPack, float price, int measureCount, String unitOfMeasure) {
        float pricePerUnit = 0;
        int unitCount = 0;
        String convertedUnitOfMeasure = "";

        if (unitOfMeasure.toLowerCase().equals("kg") || unitOfMeasure.toLowerCase().equals("l")) {
            float pricePerGram = price / Math.multiplyExact(numberOfItemsInPack, Math.multiplyExact(measureCount, 1000));
            pricePerUnit = pricePerGram * 100;
            convertedUnitOfMeasure = unitOfMeasure == "kg" ? "g" : "ml";
            unitCount = 100;
        }
        else if (unitOfMeasure.toLowerCase().equals("g") || unitOfMeasure.toLowerCase().equals("ml")) {
            float pricePerGram = price / Math.multiplyExact(numberOfItemsInPack, measureCount);
            pricePerUnit = pricePerGram * 100;
            convertedUnitOfMeasure = unitOfMeasure;
            unitCount = 100;
        }
        else if (unitOfMeasure.toLowerCase().equals("item")) {
            pricePerUnit = price / Math.multiplyExact(numberOfItemsInPack, measureCount);
            unitCount = 1;
        }
        float roundedPrice = (float) (Math.round(pricePerUnit * Math.pow(10, 2)) / Math.pow(10, 2));
        return new PricePerUnit(roundedPrice, unitCount, convertedUnitOfMeasure);
    }

}
