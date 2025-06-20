package com.example.catalogue.repository;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ProductEntity implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;

    String name;
    String image;
    String categoryPath;
    String measure;
    int measureCount;
    String unitOfMeasure;
    String shelfLife;
    int shelfLifeCount;
    String shelfLifeUnit;
    float price;
    float rating;
    List<String> dietaryIcons;
    int stockCount;
}
