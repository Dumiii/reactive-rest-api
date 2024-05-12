package com.github.reactiverestapi.service;

import com.github.reactiverestapi.model.Product;
import com.github.reactiverestapi.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final Logger logger = LoggerFactory.getLogger(Product.class);

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getProduct(long id) {
        logger.info("Request to get product with id: {}", id);
        return productRepository.getProduct(id);
    }
}
