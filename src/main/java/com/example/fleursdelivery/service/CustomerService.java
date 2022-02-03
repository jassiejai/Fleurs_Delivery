package com.example.fleursdelivery.service;


import com.example.fleursdelivery.model.Customer;
import com.example.fleursdelivery.model.Order;
import com.example.fleursdelivery.repository.CustomerRepository;
import com.example.fleursdelivery.repository.OrderRepository;
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


    private OrderRepository orderRepository;

    @Autowired
    public void setOrderRepository(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
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

    public Order createOrder (Long customerId, Order orderObject){

        Customer customer = customerRepository.getById(customerId);

        Order crtOrder = orderRepository.save(orderObject);

        crtOrder.setCustomerName(customer.getFirstName() + " " + customer.getLastName());
        crtOrder.setCustomer(customer);
        return orderRepository.save(crtOrder);

    }

    public Object updateOrder(Long customerId, Order customerObject){


        Customer customer = customerRepository.getById(customerId);
        Optional<Order> updateOrder = orderRepository.findById(customerId);



        updateOrder.get().setTimeAndDate(customerObject.getTimeAndDate());
        updateOrder.get().setPhoneNumber(customerObject.getPhoneNumber());
        updateOrder.get().setDeliveryAddress(customerObject.getDeliveryAddress());
        return orderRepository.save(updateOrder.get());

    }



}
