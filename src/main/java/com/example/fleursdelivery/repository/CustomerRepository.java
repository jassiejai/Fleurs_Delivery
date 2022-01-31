package com.example.fleursdelivery.repository;


import com.example.fleursdelivery.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByName(String customerName);

    Customer findById(Long customerId);

    Customer findByUserIdAndName(Long customerId);

}
