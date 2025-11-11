package com.example.catalogue.controller.model;

import java.util.List;

import com.example.catalogue.domain.model.product.Measure;
import com.example.catalogue.domain.model.product.PricePerUnit;
import com.example.catalogue.domain.model.product.ProductEnriched;
import com.example.catalogue.domain.model.product.ShelfLife;

public record ProductDto(
        long id,
        String name,
        String image,
        String category,

        Measure measure,
        ShelfLife shelfLife,

        float price,
        int stockAtThisPrice,
        PricePerUnit pricePerUnit,
        float rating,
        List<String>dietaryIcons,
        int stockCount
) {
    public static ProductDto fromDomainModel(ProductEnriched product) {
        return new ProductDto(
                product.getId(),
                product.getName(),
                product.getImage(),
                product.getCategory(),
                new Measure(
                        product.getMeasure().measureType(),
                        product.getMeasure().measureCount(),
                        product.getMeasure().unitOfMeasure()
                ),
                new ShelfLife(
                        product.getShelfLife().shelfLifeCount(),
                        product.getShelfLife().shelfLifeUnit()
                ),
                product.getPrice(),
                product.getStockAtThisPrice(),
                product.getPricePerUnit(),
                product.getRating(),
                product.getDietaryIcons(),
                product.getStockCount()
        );
    }
}
