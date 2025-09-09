package com.example.catalogue.kafka;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.example.catalogue.controller.model.ProductFlatDto;
import com.example.catalogue.domain.CatalogueService;
import com.example.catalogue.domain.model.ProductPrice;
import com.example.catalogue.domain.model.ProductRaw;

@Component
public class KafkaConsumer {

    CatalogueService catalogueService;

    @Autowired
    public KafkaConsumer(CatalogueService catalogueService){
        this.catalogueService = catalogueService;
    }


    @KafkaListener(id = "create-product", groupId = "pricing", topics = {"create-product"})
    public void listenCreateProduct(ProductFlatDto productFlatDto) {
        catalogueService.createProduct(new ProductRaw(productFlatDto));
    }

    @KafkaListener(id = "update-price", groupId = "pricing", topics = {"update-price"})
    public void listenUpdatePrices(List<ProductPrice> productPrices) {
        catalogueService.updatePrices(productPrices);
    };

}
