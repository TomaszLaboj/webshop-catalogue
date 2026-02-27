package com.example.catalogue.domain.productService.model.product;

import com.example.catalogue.controller.productController.model.ProductFlatDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class NewProductFlatDto extends ProductFlatDto {
    float wholesalePrice;
}
