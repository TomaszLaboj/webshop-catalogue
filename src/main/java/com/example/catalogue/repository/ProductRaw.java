package com.example.catalogue.repository;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProductRaw {
    Long id;

    String name;
    String image;
    String categoryPath;

    Measure measure;
    ShelfLife shelfLife;

    float price;

    float rating;
    List<String> dietaryIcons;
    int stockCount;
}
