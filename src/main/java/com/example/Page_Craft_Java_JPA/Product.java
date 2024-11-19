package com.example.Page_Craft_Java_JPA;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private double price;
    @Column(nullable = false)
    private boolean isBought;

    public Product() {

    }

    public Product(String name, Long id, double price, boolean isBought) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.isBought = isBought;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
