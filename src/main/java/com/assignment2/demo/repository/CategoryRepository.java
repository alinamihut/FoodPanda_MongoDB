package com.assignment2.demo.repository;

import com.assignment2.demo.model.FoodCategory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends MongoRepository<FoodCategory, String> {
    Optional<FoodCategory>  findByName(String name);
}
