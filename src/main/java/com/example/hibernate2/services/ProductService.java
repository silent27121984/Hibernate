package com.example.hibernate2.services;

import com.example.hibernate2.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private ProductRepository productRepository;

    public List<String> getProductName(String name) {
        return productRepository.getProductName(name);
    }
}

