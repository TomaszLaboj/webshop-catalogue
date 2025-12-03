package com.example.catalogue.domain.productService.model.product;

import lombok.Getter;
import lombok.Setter;

public record Measure (
    String measureType,
    int measureCount,
    String unitOfMeasure
) {};
