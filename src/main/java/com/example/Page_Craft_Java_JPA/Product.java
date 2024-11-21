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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getBought() {
        return isBought;
    }

    public void setBought(boolean isBought) {
        this.isBought = isBought;

    }
}
