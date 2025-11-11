package com.example.catalogue.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.example.catalogue.domain.model.product.ProductPrice;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class KafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    ObjectMapper mapper = new ObjectMapper();

   public void sendUpdatedStock(ProductPrice productPrice) throws JsonProcessingException {
      kafkaTemplate.send("update-stock", mapper.writeValueAsString(productPrice));
   }

   public void checkPrice(Long productId) throws JsonProcessingException {
        kafkaTemplate.send("check-price", mapper.writeValueAsString(productId));
   }

}
