package com.example.catalogue.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductPrice {
    Long id;
    float price;
    int stockQuantity;

    public ProductPrice(Long id, float price, int stockQuantity) {
        this.id = id;
        this.price = price;
        this.stockQuantity = stockQuantity;
    };

    public ProductPrice(Long id, float price) {
        this.id = id;
        this.price = price;
    };

}
