package com.example.catalogue.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PricePerUnit {

    float pricePerUnit;
    int unitCount;
    String unitOfMeasure;
}
