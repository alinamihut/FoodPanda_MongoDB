package com.assignment2.demo.repository;
import com.assignment2.demo.model.Restaurant;
import com.assignment2.demo.model.RestaurantAdministrator;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RestaurantRepository  extends MongoRepository<Restaurant, String> {

    Optional<Restaurant> findRestaurantByName(String name);

    Optional<Restaurant> findByAdministrator(RestaurantAdministrator administrator);

}
