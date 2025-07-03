package com.example.catalogue.repository.model;

import java.io.Serializable;
import java.util.List;

import com.example.catalogue.domain.model.Measure;
import com.example.catalogue.domain.model.ProductRaw;
import com.example.catalogue.domain.model.ShelfLife;

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
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;

    String name;
    String image;
    String categoryPath;

    String measureType;
    int measureCount;
    String unitOfMeasure;

    int shelfLifeCount;
    String shelfLifeUnit;

    float price;

    float rating;
    List<String> dietaryIcons;
    int stockCount;

    public ProductEntity(ProductRaw productRaw) {
        this.name = productRaw.getName();
        this.image = productRaw.getImage();
        this.categoryPath = productRaw.getCategoryPath();
        this.measureType = productRaw.getMeasure().measureType();
        this.measureCount = productRaw.getMeasure().measureCount();
        this.unitOfMeasure = productRaw.getMeasure().unitOfMeasure();
        this.shelfLifeCount = productRaw.getShelfLife().shelfLifeCount();
        this.shelfLifeUnit = productRaw.getShelfLife().shelfLifeUnit();
        this.price = productRaw.getPrice();
        this.rating = productRaw.getRating();
        this.dietaryIcons = productRaw.getDietaryIcons();
        this.stockCount = productRaw.getStockCount();
    }

    public ProductEntity() {};

    public ProductRaw toRaw() {
        return new ProductRaw(
                this.getId(),
                this.getName(),
                this.getImage(),
                this.getCategoryPath(),
                new Measure(
                        this.getMeasureType(),
                        this.getMeasureCount(),
                        this.getUnitOfMeasure()
                ),
                new ShelfLife(
                        this.getShelfLifeCount(),
                        this.getShelfLifeUnit()
                ),
                this.getPrice(),
                this.getRating(),
                this.getDietaryIcons(),
                this.getStockCount()
        );
    }

}
