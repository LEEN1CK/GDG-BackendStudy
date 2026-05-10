package com.example.MyShop.order.service;

import com.example.MyShop.order.dto.OrderCreateRequest;
import com.example.MyShop.order.entity.Order;

import java.util.List;

public interface OrderService {
    Long createOrder(OrderCreateRequest orderCreateRequest);
    List<Order> getAllOrders();
    Order getOrderById(Long id);
    void cancelOrder(Long id);
}
