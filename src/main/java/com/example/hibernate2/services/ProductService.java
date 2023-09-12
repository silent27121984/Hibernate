package com.example.hibernate2.services;

import com.example.hibernate2.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<String> getProductName(String name) {
        return productRepository.getProductName(name);
    }
}

