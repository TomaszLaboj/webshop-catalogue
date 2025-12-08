package com.example.catalogue.domain.productService.model.product;

public record Measure (
    int numberOfItemsInPack,
    String measureType,
    int measureCount,
    String unitOfMeasure
) {};
