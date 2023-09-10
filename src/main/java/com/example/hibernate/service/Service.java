package com.example.hibernate.service;

import java.util.List;

import com.example.hibernate.repository.Repository;
import com.example.hibernate.entity.Person;
import lombok.AllArgsConstructor;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class Service {
    private final Repository repository;

    public List<Person> getPersonsByCity(String city) {
        return repository.getPersonsByCity(city);
    }
}
