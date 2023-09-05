package com.assignment2.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;


import java.util.List;

@Document("menuItem")
public class MenuItem {
    @Id
    private String idFood;
    private String name;
    private String description;
    private Integer price;

    @DocumentReference
    private FoodCategory category;

    @DocumentReference
    private Restaurant restaurant;

    @DocumentReference
    private List<Order> orders;

    public MenuItem( String name, String description, Integer price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
    public void setIdFood(String idFood) {
        this.idFood = idFood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public FoodCategory getCategory() {
        return category;
    }

    public void setCategory(FoodCategory category) {
        this.category = category;
    }


    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
