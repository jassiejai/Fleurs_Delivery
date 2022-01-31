package com.example.fleursdelivery.model;

import javax.persistence.*;

@Entity
@Table(name = "flower")
public class Flower {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String floName;

    @Column
    private Boolean vase;

    @Column
    private Long floNumber;

    public Flower() {
    }

    public Flower(Long id, String floName, Boolean vase, Long floNumber) {
        this.id = id;
        this.floName = floName;
        this.vase = vase;
        this.floNumber = floNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFloName() {
        return floName;
    }

    public void setFloName(String floName) {
        this.floName = floName;
    }

    public Boolean getVase() {
        return vase;
    }

    public void setVase(Boolean vase) {
        this.vase = vase;
    }

    public Long getFloNumber() {
        return floNumber;
    }

    public void setFloNumber(Long floNumber) {
        this.floNumber = floNumber;
    }
}
