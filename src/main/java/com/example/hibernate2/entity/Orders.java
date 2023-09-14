package com.example.hibernate2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@IdClass(OrdersId.class)
@Table(name = "orders")
public class Orders{
    @Column
    private Date date;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    Customers customers;

    @Id
    @Column(nullable = false, name = "product_name")
    private String productName;

    @Column(nullable = false)
    private int amount;

}
