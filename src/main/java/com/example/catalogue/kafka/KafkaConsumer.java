package com.example.catalogue.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.example.catalogue.repository.CatalogueRepository;

@Component
public class KafkaConsumer {

    CatalogueRepository catalogueRepository;

    @Autowired
    public KafkaConsumer(CatalogueRepository catalogueRepository) {
        this.catalogueRepository = catalogueRepository;
    }


    @KafkaListener(id = "products", groupId = "catalogue", topics = {"product-price"})
    public void listenPrice() {}
}
