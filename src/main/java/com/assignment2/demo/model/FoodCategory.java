package com.assignment2.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;


import java.util.List;

@Document("foodCategory")
public class FoodCategory {

    @Id
    private String idCategory;
    private String name;


    @DocumentReference
    private List<MenuItem> food;

    public FoodCategory(String idCategory, String name) {
        this.idCategory = idCategory;
        this.name = name;
    }

    public FoodCategory() {

    }

    public String getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(String idCategory) {
        this.idCategory = idCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MenuItem> getFood() {
        return food;
    }

    public void setFood(List<MenuItem> food) {
        this.food = food;
    }
}
