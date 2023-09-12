package com.example.hibernate.entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonId implements Serializable {
    private int id;
    private String name;
    private String surname;
    private int age;
}
