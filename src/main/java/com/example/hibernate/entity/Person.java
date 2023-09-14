package com.example.hibernate.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@IdClass(PersonId.class)
@Table(name = "persons")
public class Person {
    @Id
    @Column(nullable = false)
    private String name;

    @Id
    @Column(nullable = false)
    private String surname;

    @Id
    @Column(nullable = false)
    private int age;
    @Column(nullable = false, name = "phone_number")
    private int phoneNumber;
    @Column(nullable = false, name = "city_of_living")
    private String cityOfLiving;
}
