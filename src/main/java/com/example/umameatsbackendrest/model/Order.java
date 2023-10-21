package com.example.umameatsbackendrest.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Order {
    @Id
    private String id;
    private String orderNumber;
    private String customerName;
    private String dish;
    private double price;
    private String deliveryAddress;
    private String status;

    // Getters and setters for the new fields
}
