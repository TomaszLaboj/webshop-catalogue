package com.example.catalogue.domain.model;

public record Measure (
    String measureType,
    int measureCount,
    String unitOfMeasure
) {};
