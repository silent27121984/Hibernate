package com.example.hibernate.controller;

import com.example.hibernate.entity.Person;
import com.example.hibernate.service.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class Controller {
    private final Service service;

    @GetMapping("/persons/by-city")
    public List<Person> getPersonsByCity(@RequestParam(value = "city", required = false) String city) {
        return service.getPersonsByCity(city);
    }
}
