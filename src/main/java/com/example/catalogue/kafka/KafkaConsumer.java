package com.example.catalogue.kafka;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.example.catalogue.LoggingController;
import com.example.catalogue.controller.productController.model.ProductFlatDto;
import com.example.catalogue.domain.productService.CatalogueService;
import com.example.catalogue.domain.productService.model.product.ProductPrice;
import com.example.catalogue.domain.productService.model.product.ProductRaw;

@Component
public class KafkaConsumer {

    CatalogueService catalogueService;
    Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @Autowired
    public KafkaConsumer(CatalogueService catalogueService){
        this.catalogueService = catalogueService;

    }

    @KafkaListener(id = "update-price", groupId = "pricing", topics = {"update-price"})
    public void listenUpdatePrices(List<ProductPrice> productPrices) {
        catalogueService.updatePrices(productPrices);
    };

    @KafkaListener(id = "check-price", groupId = "pricing", topics = {"send-price"}, containerFactory = "productPriceKafkaListenerContainerFactory")
    public void listenSendPrice(ProductPrice productPrice) {
    // price is received now do something with it
        logger.info("Received a message: " + productPrice.toString());
    }

    @KafkaListener(id = "check-messgae", groupId = "pricing", topics = {"send-message"})
    public void listenSendMessage(String message) {
        logger.info("Received a message: " + message);
    }

}
