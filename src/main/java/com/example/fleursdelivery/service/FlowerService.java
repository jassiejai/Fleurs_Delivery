package com.example.fleursdelivery.service;


import com.example.fleursdelivery.model.Customer;
import com.example.fleursdelivery.model.Flower;
import com.example.fleursdelivery.repository.FlowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerService {

    private FlowerRepository flowerRepository;

    @Autowired
    public void setFlowerRepository(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public List<Flower> getFlowers(){
        List<Flower> allCustomer = flowerRepository.findAll();
        return allCustomer;
    }

    public Flower createFlower(Flower flowerId){

        Flower crtFlower = flowerRepository.save(flowerId);


        return crtFlower;
    }
}
