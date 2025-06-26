package com.example.catalogue.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.example.catalogue.repository.JpaProductRepository;

@Component
public class KafkaConsumer {

    JpaProductRepository catalogueRepository;

    @Autowired
    public KafkaConsumer(JpaProductRepository catalogueRepository) {
        this.catalogueRepository = catalogueRepository;
    }


    @KafkaListener(id = "products", groupId = "catalogue", topics = {"product-price"})
    public void listenPrice() {}
}
