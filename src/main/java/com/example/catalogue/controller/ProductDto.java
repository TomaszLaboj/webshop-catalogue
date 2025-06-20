package com.example.catalogue.controller;

import java.util.List;

public record ProductDto(
        String name,
        String image,
        String categoryPath,
        String measure,
        int measureCount,
        String unitOfMeasure,
        String shelfLife,
        int shelfLifeCount,
        String shelfLifeUnit,
        float price,
        float rating,
        List<String>dietaryIcons,
        int stockCount
) {
}
