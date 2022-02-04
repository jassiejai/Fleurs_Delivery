package com.example.fleursdelivery.controller;

import com.example.fleursdelivery.model.Flower;
import com.example.fleursdelivery.model.Order;
import com.example.fleursdelivery.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class OrderController {

    private OrderService orderService;

    @Autowired
    public void setOrderService(OrderService orderService) {this.orderService = orderService;}


    @GetMapping("/orders")
    public List<Order> getAllOrders(){
        System.out.println("Getting all orders");
        return orderService.getAllOrders();
    }

    @GetMapping("/order/{orderId}")
    public Optional<Order> getCustomerOrder(@PathVariable Long orderId){
        System.out.println("Got order");

        return orderService.getCustomerOrder(orderId);
    }


    @DeleteMapping ("/order/{orderId}")
    public void deleteOrder(@PathVariable(value = "orderId") Long customerId){

        System.out.println("Deleted order");

        orderService.deleteOrder(customerId);
    }

//    @GetMapping(path = "/flowers")
//    public List<Flower> getAllFlower(){
//
//        return orderService.getAllFlowers();
//    }
}
