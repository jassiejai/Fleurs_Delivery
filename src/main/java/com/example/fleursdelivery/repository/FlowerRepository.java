package com.example.fleursdelivery.repository;

import com.example.fleursdelivery.model.Flower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FlowerRepository extends JpaRepository {

    Flower findByVase(Boolean yesVase);

}
