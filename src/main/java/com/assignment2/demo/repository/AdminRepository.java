package com.assignment2.demo.repository;

import com.assignment2.demo.model.RestaurantAdministrator;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepository extends MongoRepository<RestaurantAdministrator, String> {
    Optional<RestaurantAdministrator> findByUsername(String username);
    Optional<RestaurantAdministrator> findByIdAdministrator(String id);

    Optional<RestaurantAdministrator> findRestaurantAdministratorByRestaurantName(String name);
}
