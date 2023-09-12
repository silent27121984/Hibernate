package com.example.hibernate2.controllers;

import com.example.hibernate2.services.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    private final Service productService;

    public Controller(Service productService) {
        this.productService = productService;
    }

    @GetMapping("/products/fetch-product")
    public List<String> getProductName(@RequestParam (value = "name",required = false) String name) {
        return productService.getProductName(name);
    }
}
