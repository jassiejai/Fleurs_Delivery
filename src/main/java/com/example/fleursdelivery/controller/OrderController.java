package com.example.fleursdelivery.controller;

import com.example.fleursdelivery.model.Order;
import com.example.fleursdelivery.repository.OrderRepository;
import com.example.fleursdelivery.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class OrderController {

    private OrderService orderService;

    @Autowired
    public void setOrderService(OrderService orderService) {this.orderService = orderService;}

    @GetMapping("/orders")
    public Order getAllOrders(){
        System.out.println("Getting all orders");
        return orderService.getAllOrders();
    }

    @GetMapping("/order/{orderId}")
    public OrderRepository getCustomerOrder(@PathVariable Long orderId){
        System.out.println("Got order");

        return orderService.getCustomerOrder(orderId);
    }

//    @PostMapping("/order/")
//    public Customer createCustomer(@RequestBody Customer customerObject){
//        System.out.println("Created customer");
//
//        return customerService.createCustomer(customerObject);
//    }

//    @PutMapping ("/customer/{customerId}")
//    public Object updateCustomer(@PathVariable(
//            value = "customerId") Long customerId, @RequestBody Customer customerObject){
//        System.out.println("Created customer");
//
//        return customerService.updateCustomer(customerId, customerObject);
//    }

//    @DeleteMapping ("/customer/{customerId}")
//    public void deleteCustomer(@PathVariable(value = "customerId") Long customerId){
//
//        System.out.println("Deleted customer");
//
//        customerService.deleteCustomer(customerId);
//    }




}
