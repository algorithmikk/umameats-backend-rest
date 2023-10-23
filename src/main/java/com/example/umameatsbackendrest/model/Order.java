package com.example.umameatsbackendrest.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
public class Order {
    @Id
    private String id;
    private String userID;
    private String restaurantID;
    private double total;
    private String status;
    private List<String> orderDishes;
    private String courierID;

    // Getters and setters for the new fields
}
