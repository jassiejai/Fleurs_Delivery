package com.example.fleursdelivery.service;


import com.example.fleursdelivery.model.Customer;
import com.example.fleursdelivery.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository){
        this.customerRepository=customerRepository;
    }


    public List<Customer> getCustomers(){
        List<Customer> allCustomer = customerRepository.findAll();
        return allCustomer;
    }


    public Customer getCustomer(Long customerId){
        Customer customer = customerRepository.getById(customerId);
        return customer;
    }


    public Customer createCustomer(Customer customerObject){

        Customer crtCustomer = customerRepository.save(customerObject);
//                findByPhoneNumber(customerObject.getPhoneNumber());
        return customerRepository.save(crtCustomer);

    }

    public Object updateCustomer(Long customerId, Customer customerObject){


        Optional<Customer> updateCustomer = customerRepository.findById(customerId);


        updateCustomer.get().setFirstName(customerObject.getFirstName());
        updateCustomer.get().setLastName(customerObject.getLastName());
        updateCustomer.get().setPhoneNumber(customerObject.getPhoneNumber());
        updateCustomer.get().setAddress(customerObject.getAddress());
        updateCustomer.get().setEmailAddress(customerObject.getEmailAddress());
        return customerRepository.save(updateCustomer.get());

    }

    public void deleteCustomer(Long customerId){

        Customer dltCustomer = customerRepository.getById(customerId);

//        customerRepository.delete(dltCustomer.get());
        customerRepository.delete(dltCustomer);
    }




}
