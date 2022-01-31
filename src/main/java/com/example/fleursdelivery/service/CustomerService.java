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

    public Customer getCustomer(Long customerId){
        Customer customer = customerRepository.getById(customerId);
        return customer;
    }

    public Customer createCustomer(Customer customerObject){

        Customer customer = customerRepository.findByName(customerObject.getFirstName());
        return customerRepository.save(customerObject);

    }

    public Customer updateCustomer(Long customerId, String customerObject){

        Customer updateCustomer = customerRepository.findById(customerId);
        updateCustomer.setFirstName(customerObject);
        updateCustomer.setLastName(customerObject);
        updateCustomer.setPhoneNumber(customerObject);
        updateCustomer.setAddress(customerObject);
        updateCustomer.setEmailAddress(customerObject);
        return customerRepository.save(updateCustomer);
    }




}
