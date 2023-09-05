package com.assignment2.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import java.util.List;
import java.util.Set;

@Document("deliveryZone")
public class DeliveryZone {
    @Id
    private String idDeliveryZone;
    private String name;

    @DocumentReference
    private List<Restaurant> restaurants;

    public DeliveryZone() {
    }

    public DeliveryZone(String idDeliveryZone, String name) {
        this.idDeliveryZone = idDeliveryZone;
        this.name = name;
    }

    public String getIdDeliveryZone() {
        return idDeliveryZone;
    }

    public void setIdDeliveryZone(String idDeliveryZone) {
        this.idDeliveryZone = idDeliveryZone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }
}
