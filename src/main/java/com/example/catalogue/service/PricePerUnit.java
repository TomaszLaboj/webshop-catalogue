package com.example.catalogue.service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class PricePerUnit {
    PricePerUnit(int unitCount, String unitOfMeasure){
        this.unitCount = unitCount;
        this.unitOfMeasure = unitOfMeasure;
    };
    int unitCount;
    String unitOfMeasure;
}
