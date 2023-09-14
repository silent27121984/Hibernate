package com.example.hibernate.service;

import java.util.List;

import com.example.hibernate.repository.ProductRepository;
import com.example.hibernate.entity.Person;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Person> getPersonsByCity(String city) {
        return productRepository.getPersonsByCity(city);
    }
}
