package com.example.MyShop.order.repository;

import com.example.MyShop.order.entity.Order;

import java.util.List;

public interface OrderRepository {

    void save(Order order);

    Order findById(Long id);
    List<Order> findAll();
}
