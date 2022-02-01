package com.example.fleursdelivery.controller;

import com.example.fleursdelivery.model.Customer;
import com.example.fleursdelivery.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class CustomerController {


    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/helloWorld")
    public String hello(){
        return "Hello world";
    }
    @GetMapping("/customers")
    public List<Customer> getCustomers(){
        System.out.println("Getting customers");
        return customerService.getCustomers();
    }

    @GetMapping("/customer/{customerId}")
    public Customer getCustomer(@PathVariable Long customerId){
        System.out.println("Got customer");

        return customerService.getCustomer(customerId);
    }

    @PostMapping ("/customer/{customerId}")
    public Customer createCustomer(@RequestBody Customer customerObject){
        System.out.println("Created customer");

        return customerService.createCustomer(customerObject);
    }







}
