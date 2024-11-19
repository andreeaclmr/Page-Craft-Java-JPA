package com.example.Page_Craft_Java_JPA;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    @Column(nullable = false)
    private String item;
    @Column(nullable = false)
    private Boolean isBought;

    public Product(String item, Boolean isBought) {
        this.item = item;
        this.isBought = isBought;
    }

    public Product() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
