package com.example.catalogue.repository;

public record Measure (
    String measureType,
    int measureCount,
    String unitOfMeasure
) {};
