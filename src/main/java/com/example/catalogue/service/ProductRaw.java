package com.example.catalogue.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.catalogue.repository.CatalogueRepository;

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
