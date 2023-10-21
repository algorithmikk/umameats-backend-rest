package com.example.umameatsbackendrest.repository;

import com.example.umameatsbackendrest.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface OrderRepository extends MongoRepository<Order, String> {


}
