package com.example.fleursdelivery.controller;

import com.example.fleursdelivery.model.Customer;
import com.example.fleursdelivery.model.Order;
import com.example.fleursdelivery.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class CustomerController {


    private CustomerService customerService;

    @Autowired
    public void setCustomerService(CustomerService customerService) {
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
    public Customer getCustomer(@PathVariable(value = "customerId") Long customerId){
        System.out.println("Got customer");

        return customerService.getCustomer(customerId);
    }

    @PostMapping("/customer/")
    public Customer createCustomer(@RequestBody Customer customerObject){
        System.out.println("Created customer");

        return customerService.createCustomer(customerObject);
    }

    @PutMapping ("/customer/{customerId}")
    public Object updateCustomer(@PathVariable(
            value = "customerId") Long customerId, @RequestBody Customer customerObject){
        System.out.println("Created customer");

        return customerService.updateCustomer(customerId, customerObject);
    }

    @DeleteMapping ("/customer/{customerId}")
    public void deleteCustomer(@PathVariable(value = "customerId") Long customerId){

        System.out.println("Deleted customer");

        customerService.deleteCustomer(customerId);
    }

    @PostMapping("/customer/{customerId}/order/")
    public Order createOrder(@PathVariable (value = "customerId")Long customerId,
                             @RequestBody Order orderObject ){
        System.out.println("Created Order");

        return customerService.createOrder(customerId,orderObject);
    }

    @PutMapping ("/customer/{customerId}/order/{orderId}")
    public Object updateOrder( @PathVariable(value = "customerId") String customerId,
                               @PathVariable(value = "orderId") Long orderId,
                               @RequestBody Order orderObject){
        System.out.println("Updated order");

        return customerService.updateOrder(orderId, orderObject);
    }
    @DeleteMapping ("/customer/{customerId}/order/{orderId}")
    public void deleteOrder(@PathVariable(value = "orderId") Long orderId, @PathVariable(value = "customerId") String customerId){

        System.out.println("Deleted order of " + orderId);

        customerService.deleteOrder(orderId);
    }



}
