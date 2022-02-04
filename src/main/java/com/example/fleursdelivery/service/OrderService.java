package com.example.fleursdelivery.service;

import com.example.fleursdelivery.exceptions.InformationNotFound;
import com.example.fleursdelivery.model.Flower;
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

        if(allOrders.isEmpty()){
           throw new InformationNotFound("No orders could be found");
        } else {
            return allOrders;
        }

    }


    public Optional<Order> getCustomerOrder(Long orderId){

        Optional<Order> orderCustomer = orderRepository.findById(orderId);

        if(orderCustomer.isPresent()){
            return orderCustomer;
        } else {
            throw new InformationNotFound("Order could not be found");
        }

    }
    public void deleteOrder(Long orderId){

        Order dltOrder = orderRepository.getById(orderId);

//        customerRepository.delete(dltCustomer.get());

        if(dltOrder == null){

            throw new InformationNotFound("Could not delete Id "+ orderId);
        } else {
            orderRepository.delete(dltOrder);
        }
    }


//   public List<Flower> getAllFlowers(){
//
//        List<Flower> allFlowers = orderRepository.findAll();
//        return allFlowers;
//   }

//    public Order createOrder (Order orderObject){
//
//        Order crtOrder = orderRepository.save(orderObject);
////                findByPhoneNumber(customerObject.getPhoneNumber());
//        return orderRepository.save(crtOrder);
//
//    }
//
//    public Object updateOrder(Long customerId, Order customerObject){
//
//
//        Optional<Order> updateOrder = orderRepository.findById(customerId);
//
//
//        updateOrder.get().setCustomerName(customerObject.getCustomerName());
//        updateOrder.get().setTimeAndDate(customerObject.getTimeAndDate());
//        updateOrder.get().setPhoneNumber(customerObject.getPhoneNumber());
//        updateOrder.get().setDeliveryAddress(customerObject.getDeliveryAddress());
//        return orderRepository.save(updateOrder.get());
//
//    }





}
