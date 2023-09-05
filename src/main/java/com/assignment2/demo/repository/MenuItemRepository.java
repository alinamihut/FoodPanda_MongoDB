package com.assignment2.demo.repository;

import com.assignment2.demo.model.MenuItem;
import com.assignment2.demo.model.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MenuItemRepository  extends MongoRepository<MenuItem, String> {
    Optional<MenuItem> findByName(String name);
    List<MenuItem> findAllByRestaurant(Restaurant restaurant);
}
