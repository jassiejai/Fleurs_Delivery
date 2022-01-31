package com.example.fleursdelivery.service;


import com.example.fleursdelivery.model.Customer;
import com.example.fleursdelivery.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;

    public void setCustomerRepository(CustomerRepository customerRepository){
        this.customerRepository=customerRepository;
    }

    public List<Customer> getCustomers(){

        List<Customer> customer = customerRepository.findAll();
        return customer;
    }
}
