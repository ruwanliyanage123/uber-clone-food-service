package com.uberclone.core.foodservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "food_data")
public class FoodEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "foodName")
    private String foodName;
    @Column(name = "shopName")
    private String shopName;
    @Column(name = "price")
    private double price;
    @Column(name = "rate")
    private double rate;
    @Column(name = "description")
    private String description;
}
