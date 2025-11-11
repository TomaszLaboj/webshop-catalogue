package com.example.catalogue.domain.model.product;

public record Measure (
    String measureType,
    int measureCount,
    String unitOfMeasure
) {};
