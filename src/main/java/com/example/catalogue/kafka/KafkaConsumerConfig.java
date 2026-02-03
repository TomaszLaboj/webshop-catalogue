package com.example.catalogue.kafka;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import com.example.catalogue.domain.productService.model.product.ProductPrice;

@Configuration
public class KafkaConsumerConfig {

    @Bean
    public ConsumerFactory<String, ProductPrice> productPriceConsumerFactory() {
        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(ConsumerConfig.GROUP_ID_CONFIG, "pricing");

        JsonDeserializer<ProductPrice> deserializer = new JsonDeserializer<>(ProductPrice.class);
        deserializer.addTrustedPackages("com.example.catalogue.domain.productService.model");

        return new DefaultKafkaConsumerFactory<>(
                props,
                new StringDeserializer(),
                deserializer
        );
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, ProductPrice> productPriceKafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, ProductPrice> factory =
                new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(productPriceConsumerFactory());
        return factory;
    }
}
