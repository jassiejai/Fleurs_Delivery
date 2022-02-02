package com.example.fleursdelivery.controller;

import com.example.fleursdelivery.repository.OrderRepository;
import com.example.fleursdelivery.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {this.orderService = orderService;}

    @GetMapping("/orders")
    public List<OrderRepository> getAllOrders(){
        System.out.println("Getting all orders");
        return orderService.getAllOrders();
    }
//
//    @GetMapping("/customer/{customerId}")
//    public Customer getCustomer(@PathVariable Long customerId){
//        System.out.println("Got customer");
//
//        return customerService.getCustomer(customerId);
//    }
//
//    @PostMapping("/customer/")
//    public Customer createCustomer(@RequestBody Customer customerObject){
//        System.out.println("Created customer");
//
//        return customerService.createCustomer(customerObject);
//    }
//
//    @PutMapping ("/customer/{customerId}")
//    public Object updateCustomer(@PathVariable(
//            value = "customerId") Long customerId, @RequestBody Customer customerObject){
//        System.out.println("Created customer");
//
//        return customerService.updateCustomer(customerId, customerObject);
//    }
//
//    @DeleteMapping ("/customer/{customerId}")
//    public void deleteCustomer(@PathVariable(value = "customerId") Long customerId){
//
//        System.out.println("Deleted customer");
//
//        customerService.deleteCustomer(customerId);
//    }




}
