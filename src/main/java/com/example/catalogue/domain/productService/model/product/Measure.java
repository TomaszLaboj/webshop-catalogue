package com.example.catalogue.domain.productService.model.product;

public record Measure (
        int numberOfItemsInPack,
        MeasureType measureType,
        Long measureCount,
        String unitOfMeasure
) {};
