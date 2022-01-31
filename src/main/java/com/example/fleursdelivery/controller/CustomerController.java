package com.example.fleursdelivery.controller;

import com.example.fleursdelivery.model.Customer;
import com.example.fleursdelivery.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;


@RequestMapping(path = "/api")
public class CustomerController {


    private CustomerService customerService;


    @GetMapping("/customers")
    public List<Customer> getCustomers(){
        System.out.println("Getting customers");
        return customerService.getCustomers();
    }

//    @GetMapping("/customer/{customerId}")
//    public Optional getCustomer(@PathVariable Long customerId){
//        System.out.println("Got customer");
//
//        return null;
//    }







}
