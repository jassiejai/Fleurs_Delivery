package com.example.fleursdelivery.repository;


import com.example.fleursdelivery.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

        Customer findByPhoneNumber(String phoneNumber);


//        Customer delete(Long customerId);


//    Customer findByUserIdAndName(Long customerId);

}
