package com.example.fleursdelivery.model;


import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {


    @Id
    @Column
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String customerName;

    @Column
    private String datetime;

    @Column
    private Long phoneNumber;

    @Column
    private String deliveryAddress;

    public Order() {
    }

    public Order(Long id, String customerName, String datetime, Long phoneNumber, String deliveryAddress) {
        this.id = id;
        this.customerName = customerName;
        this.datetime = datetime;
        this.phoneNumber = phoneNumber;
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", datetime='" + datetime + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTimeAndDate() {
        return datetime;
    }

    public void setTimeAndDate(String datetime) {
        this.datetime = datetime;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}
