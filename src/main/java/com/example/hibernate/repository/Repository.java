package com.example.hibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import com.example.hibernate.entity.Person;
import jakarta.transaction.Transactional;

import java.util.List;


@org.springframework.stereotype.Repository
public class Repository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public List<Person> getPersonsByCity(String city) {
        return entityManager.createQuery("SELECT p FROM Person p WHERE p.cityOfLiving = :city")
                .setParameter("city", city).getResultList();
    }
}
