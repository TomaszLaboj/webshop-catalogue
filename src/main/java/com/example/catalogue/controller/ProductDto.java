package com.example.catalogue.controller;

import java.util.List;

import com.example.catalogue.repository.Measure;
import com.example.catalogue.repository.PricePerUnit;
import com.example.catalogue.repository.ShelfLife;

public record ProductDto(
        long id,
        String name,
        String image,
        String categoryPath,

        Measure measure,
        ShelfLife shelfLife,

        float price,
        PricePerUnit pricePerUnit,
        float rating,
        List<String>dietaryIcons,
        int stockCount
) {
}
