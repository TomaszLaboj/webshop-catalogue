package com.example.catalogue.controller.productController.model;

import java.util.List;

import com.example.catalogue.controller.categoryController.model.CategoryDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductFlatDto {
    private Long id;
    private String name;
    private String image;
    private CategoryDto category;
    private String typeOfMeasure;
    private int measureCount;
    private String unitOfMeasure;
    private int shelfLifeCount;
    private String shelfLifeUnitOfMeasure;
    private float price;
    private int stockAtThisPrice;
    private float rating;
    private List<String> dietaryIcons;
}
