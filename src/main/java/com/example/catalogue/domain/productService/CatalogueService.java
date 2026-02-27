package com.example.catalogue.domain.productService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.catalogue.domain.categoryService.CategoryRepository;
import com.example.catalogue.domain.categoryService.model.category.Category;
import com.example.catalogue.domain.productService.model.product.NewProductFlatDto;
import com.example.catalogue.domain.productService.model.product.ProductEnriched;
import com.example.catalogue.domain.productService.model.product.ProductPrice;
import com.example.catalogue.domain.productService.model.product.ProductRaw;
import com.example.catalogue.kafka.KafkaProducer;
import com.example.catalogue.repository.category.CategoryRepositoryPostgres;
import com.example.catalogue.repository.product.CategoryMapper;
import com.example.catalogue.repository.product.ProductRepositoryPostgres;
import com.fasterxml.jackson.core.JsonProcessingException;

@Service
public class CatalogueService {
    ProductRepository productRepository;
    CategoryRepository categoryRepository;
    KafkaProducer kafkaProducer;

    @Autowired
    public CatalogueService(ProductRepositoryPostgres productRepositoryPostgres,CategoryRepositoryPostgres categoryRepositoryPostgres, KafkaProducer kafkaProducer) {
        this.productRepository = productRepositoryPostgres;
        this.categoryRepository = categoryRepositoryPostgres;
        this.kafkaProducer = kafkaProducer;
    }


    public ProductEnriched getProductById(Long productId) throws JsonProcessingException {
        checkPrice(productId);
        return new ProductEnriched(productRepository.findById(productId));
    }

    public List<ProductEnriched> getProductByName(String name) {
        return productRepository.findByName(name);
    }

    public List<ProductEnriched> getProductsByCategory(Long categoryId) {
        Category categoryToCheck = CategoryMapper.toDomain(categoryRepository.getCategoryByCategoryId(categoryId));
        List<ProductEnriched> products = new ArrayList<>();
        List<Long> categoriesIds = getSubcategoriesIds(categoryToCheck);
        for (Long id : categoriesIds) {
            List<ProductEnriched> tempList = productRepository.findProductsByCategoryId(id);
            products.addAll(tempList);
        }
        return products;
    }

    List<Long> getSubcategoriesIds(Category category) {
        List<Long> ids = new ArrayList<>();
        ids.add(category.getCategoryId());
        for (Category subcategory:category.getSubcategories()) {
            List<Long> subcategoryIds = getSubcategoriesIds(subcategory);
            if(!subcategoryIds.isEmpty()) { ids.addAll(subcategoryIds); }
        }
        return ids;
    }

    public List<ProductEnriched> getAllProducts() {
        List<ProductEnriched> allProducts = productRepository.findAll();
        return allProducts;
    }

    public ProductRaw createProduct(NewProductFlatDto newProductFlatDto) {
        kafkaProducer.createProduct(
        productRepository.save(productRaw);
        return  productRaw;
    }

    public ProductRaw updateStock(ProductPrice productPrice) throws JsonProcessingException {
        kafkaProducer.sendUpdatedStock(productPrice);
        return productRepository.updateStock(productPrice.getId(), productPrice.getStockQuantity());
    }

    public void checkPrice(Long productId) throws JsonProcessingException {
        kafkaProducer.checkPrice(productId);
    }


    public List<ProductRaw> updatePrices(List<ProductPrice> productPrices) {
        return productPrices.stream()
                .map((productPrice) -> updatePrice(productRepository.findById(productPrice.getId()))
                )
                .collect(Collectors.toList());
    }
    //                                                              this may be incorrect?
    public ProductRaw updatePrice(ProductRaw productRaw) {
        return productRepository.save(productRaw).toRaw();
    }


}
