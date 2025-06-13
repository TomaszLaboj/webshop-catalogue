package com.example.catalogue.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.example.catalogue.repository.CatalogRepository;

@Component
public class KafkaConsumer {

    CatalogRepository catalogRepository;

    @Autowired
    public KafkaConsumer(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }


    @KafkaListener(id = "products", groupId = "catalogue", topics = {"product-price"})
    public void listenPrice() {}
}
