package com.example.fleursdelivery.controller;

import com.example.fleursdelivery.model.Flower;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class FlowerController {

    private FlowerService flowerService;

    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping("/flowers")
    public List<Flower> getFlowers(){
        System.out.println("Getting all orders");
        return flowerService.getFlowers();
    }
    @PutMapping("/flower")
    public Flower createFlower(@RequestBody Flower flowerObject){
        return flowerService.createFlower(flowerObject);
    }

}
