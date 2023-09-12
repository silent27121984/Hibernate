package com.example.hibernate2.services;

import com.example.hibernate2.repositories.Repository;
import lombok.AllArgsConstructor;
import java.util.List;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class Service {

    private Repository Repository;

    public List<String> getProductName(String name) {
        return Repository.getProductName(name);
    }
}

