package com.assignment2.demo.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;


@Document("administrator")
public class RestaurantAdministrator {
    @Id
    private String idAdministrator;
    private String username;
    private String password;

    @DocumentReference
    private Restaurant restaurant;

    public RestaurantAdministrator(String idAdministrator, String username, String password, Restaurant restaurant) {
        this.idAdministrator = idAdministrator;
        this.username = username;
        this.password = password;
        this.restaurant = restaurant;
    }

    public RestaurantAdministrator() {

    }

    public RestaurantAdministrator(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getIdAdministrator() {
        return idAdministrator;
    }

    public void setIdAdministrator(String idAdministrator) {
        this.idAdministrator = idAdministrator;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
