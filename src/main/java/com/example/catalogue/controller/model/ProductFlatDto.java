package com.example.catalogue.controller.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductFlatDto {
    private Long id;
    private String name;
    private String image;
    private String categoryPath;
    private String typeOfMeasure;
    private int measureCount;
    private String unitOfMeasure;
    private int shelfLifeCount;
    private String shelfLifeUnitOfMeasure;
    private float price;
    private float rating;
    private List<String> dietaryIcons;
}
