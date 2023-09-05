package com.assignment2.demo.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;
import java.util.Set;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Document("restaurant")
public class Restaurant {
    @Id
    private String idRestaurant;
    private String name;
    private String location;


    @DocumentReference
    private RestaurantAdministrator administrator;

    @DocumentReference
    private List<MenuItem> menuItems;

    @DocumentReference
    private List<Order> orders;

    @DocumentReference
    private List<DeliveryZone> deliveryZones;

    public Restaurant(String name, String location) {
        this.name = name;
        this.location = location;
    }


}


