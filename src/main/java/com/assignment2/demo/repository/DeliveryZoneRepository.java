package com.assignment2.demo.repository;

import com.assignment2.demo.model.DeliveryZone;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DeliveryZoneRepository extends MongoRepository<DeliveryZone, String> {
    Optional<DeliveryZone> findDeliveryZoneByName (String name);
}
