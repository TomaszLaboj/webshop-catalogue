package com.example.catalogue.domain.productService.model.product;

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
