package com.example.catalogue.repository.product.model;

import java.io.Serializable;
import java.util.List;

import com.example.catalogue.domain.categoryService.model.category.Category;
import com.example.catalogue.domain.productService.model.product.Measure;
import com.example.catalogue.domain.productService.model.product.ProductRaw;
import com.example.catalogue.domain.productService.model.product.ShelfLife;
import com.example.catalogue.repository.category.model.CategoryEntity;

import jakarta.persistence.*;
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

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "category_id", nullable = false)
    CategoryEntity category;

    int numberOfItemsInPack;
    String measureType;
    int measureCount;
    String unitOfMeasure;

    int shelfLifeCount;
    String shelfLifeUnit;

    float price;
    int stockAtThisPrice;

    float rating;
    List<String> dietaryIcons;
    public int stockCount;


    public ProductEntity(ProductRaw productRaw) {
        this.name = productRaw.getName();
        this.image = productRaw.getImage();
        this.numberOfItemsInPack = productRaw.getMeasure().numberOfItemsInPack();
        this.measureType = productRaw.getMeasure().measureType();
        this.measureCount = productRaw.getMeasure().measureCount();
        this.unitOfMeasure = productRaw.getMeasure().unitOfMeasure();
        this.shelfLifeCount = productRaw.getShelfLife().shelfLifeCount();
        this.shelfLifeUnit = productRaw.getShelfLife().shelfLifeUnit();
        this.price = productRaw.getPrice();
        this.stockAtThisPrice = productRaw.getStockAtThisPrice();
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
                new Category(this.getCategory().getCategoryId(), this.getCategory().getCategoryName()),
                new Measure(
                        this.getNumberOfItemsInPack(),
                        this.getMeasureType(),
                        this.getMeasureCount(),
                        this.getUnitOfMeasure()
                ),
                new ShelfLife(
                        this.getShelfLifeCount(),
                        this.getShelfLifeUnit()
                ),
                this.getPrice(),
                this.getStockAtThisPrice(),
                this.getRating(),
                this.getDietaryIcons(),
                this.getStockCount()
        );
    }

}
