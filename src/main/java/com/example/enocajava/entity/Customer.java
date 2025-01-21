package com.example.enocajava.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class Customer extends BaseEntity {
    private String name;
    private String email;

    @OneToOne
    private Cart cart;

    @OneToMany
    private List<Order> orders;

    // Getters and setters
}
