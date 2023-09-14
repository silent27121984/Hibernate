package com.example.hibernate2.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@IdClass(CustomersId.class)
@Table(name = "customers")
public class Customers {
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
    private String phoneNumber;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    @ToString.Exclude
    private List<Orders> orderList;
    public void addOrdersToCustomer(Orders order) {
        if(orderList == null) {
            orderList = new ArrayList<>();
        }
        orderList.add(order);

    }

}
