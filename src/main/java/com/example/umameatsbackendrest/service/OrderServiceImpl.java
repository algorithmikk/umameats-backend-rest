package com.example.umameatsbackendrest.service;

import com.example.umameatsbackendrest.model.Order;
import com.example.umameatsbackendrest.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order> getAllOrders() {
        // Return mock data for testing
        return createMockOrders();
    }

    @Override
    public Order getOrderById(String id) {
        // Return a mock order with the provided ID
        return createMockOrder(id);
    }

    @Override
    public Order createOrder(Order order) {
        // In a real implementation, you would save the order to the database
        // For testing, you can return the order itself
        return order;
    }

    @Override
    public Order updateOrder(String id, Order updatedOrder) {
        // In a real implementation, you would update the order in the database
        // For testing, you can return the updated order
        return updatedOrder;
    }

    @Override
    public void deleteOrder(String id) {
        // In a real implementation, you would delete the order from the database
    }

    // Helper methods for mock data
    private List<Order> createMockOrders() {
        List<Order> orders = new ArrayList<>();
        orders.add(createMockOrder("1"));
        orders.add(createMockOrder("2"));
        // Add more mock orders as needed
        return orders;
    }

    private Order createMockOrder(String id) {
        Order order = new Order();
        order.setId(id);
        order.setOrderNumber("ORDER" + id);
        order.setCustomerName("Customer " + id);
        order.setDish("Sample Dish");
        order.setStatus("Pending");
        order.setPrice(10.99); // Set the total price as needed
        // Set other properties as needed
        return order;
    }
}
