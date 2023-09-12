package com.example.hibernate2.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<String> getProductName(String name) {
        Query query = entityManager.createQuery("select o.product_name from Orders o join o.customers c WHERE c.name = :name", String.class);
        query.setParameter("name", name);
        List<String> productNameList = query.getResultList();
        return productNameList;
    }
}
