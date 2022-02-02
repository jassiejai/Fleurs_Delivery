package com.example.fleursdelivery.service;

import com.example.fleursdelivery.model.Order;
import com.example.fleursdelivery.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService{

    private OrderRepository orderRepository;

    @Autowired
    public void setOrderRepository(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


        public List<Order> getAllOrders(){
        List<Order> allOrders = orderRepository.findAll();
        return allOrders;
    }


    public Order getCustomerOrder(Long orderId){
         Order orderCustomer = orderRepository.getById(orderId);

         return orderCustomer;

    }


    public Order createOrder (Order orderObject){

        Order crtOrder = orderRepository.save(orderObject);
//                findByPhoneNumber(customerObject.getPhoneNumber());
        return orderRepository.save(crtOrder);

    }

    public Object updateOrder(Long customerId, Order customerObject){


        Optional<Order> updateOrder = orderRepository.findById(customerId);


        updateOrder.get().setCustomerName(customerObject.getCustomerName());
        updateOrder.get().setTimeAndDate(customerObject.getTimeAndDate());
        updateOrder.get().setPhoneNumber(customerObject.getPhoneNumber());
        updateOrder.get().setDeliveryAddress(customerObject.getDeliveryAddress());
        return orderRepository.save(updateOrder.get());

    }

    public void deleteOrder(Long orderId){

        Order dltOrder = orderRepository.getById(orderId);

//        customerRepository.delete(dltCustomer.get());
        orderRepository.delete(dltOrder);
    }

}
