package com.example.catalogue.domain;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.catalogue.domain.model.ProductEnriched;
import com.example.catalogue.domain.model.ProductPrice;
import com.example.catalogue.domain.model.ProductRaw;
import com.example.catalogue.kafka.KafkaProducer;
import com.example.catalogue.repository.ProductRepositoryPostgres;
import com.fasterxml.jackson.core.JsonProcessingException;

@Service
public class CatalogueService {
    ProductRepository productRepository;
    KafkaProducer kafkaProducer;

    @Autowired
    public CatalogueService(ProductRepositoryPostgres productRepositoryPostgres,  KafkaProducer kafkaProducer) {
        this.productRepository = productRepositoryPostgres;
        this.kafkaProducer = kafkaProducer;
    }

    public ProductEnriched getProductById(long id) {
        return new ProductEnriched(productRepository.findById(id));
    };

    public List<ProductEnriched> getProductByName(String name) {
        return productRepository.findByName(name);
    }

    public List<ProductEnriched> getProductsByCategory(String category) {
        return productRepository.findProductsByCategory(category);
    };

    public List<ProductEnriched> getAllProducts() {
        return productRepository.findAll();
    };

    public ProductRaw createProduct(ProductRaw productRaw) {
        productRepository.save(productRaw);
        return  productRaw;
    }

    public List<ProductRaw> updatePrices(List<ProductPrice> productPrices) {
        List<ProductRaw> productRaws = productPrices.stream()
                .map((productPrice) -> updatePrice(productRepository.findById(productPrice.getId()))
                )
                .collect(Collectors.toList());
        return productRaws;
    }

    public ProductRaw updatePrice(ProductRaw productRaw) {
        return productRepository.save(productRaw).toRaw();
    };

    public ProductRaw updateStock(ProductPrice productPrice) throws JsonProcessingException {
        kafkaProducer.sendUpdatedStock(productPrice);
        return productRepository.updateStock(productPrice.getId(), productPrice.getStockQuantity());
    }

}
