package com.assignment2.demo.repository;

import com.assignment2.demo.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;


@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {

    Optional<Customer> findCustomerByUsername (String username);

    Optional<Customer> findCustomerByIdCustomer (String id);

}
