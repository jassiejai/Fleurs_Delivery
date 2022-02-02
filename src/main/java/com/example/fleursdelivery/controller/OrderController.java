package com.example.fleursdelivery.controller;

import com.example.fleursdelivery.model.Order;
import com.example.fleursdelivery.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public Order getCustomerOrder(@PathVariable Long orderId){
        System.out.println("Got order");

        return orderService.getCustomerOrder(orderId);
    }

    @PostMapping("/order/")
    public Order createOrder(@RequestBody Order orderObject){
        System.out.println("Created customer");

        return orderService.createOrder(orderObject);
    }

    @PutMapping ("/order/{orderId}")
    public Object updateOrder(@PathVariable(
            value = "orderId") Long orderId, @RequestBody Order orderObject){
        System.out.println("Created customer");

        return orderService.updateOrder(orderId, orderObject);
    }

    @DeleteMapping ("/order/{orderId}")
    public void deleteOrder(@PathVariable(value = "orderId") Long customerId){

        System.out.println("Deleted customer");

        orderService.deleteOrder(customerId);
    }




}
