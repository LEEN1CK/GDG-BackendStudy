package com.example.MyShop.product.repository;

import com.example.MyShop.product.entity.Product;

import java.util.List;

public interface ProductRepository {
    Product findById(Long id);
    List<Product> findAll();
    void save(Product product);
    void deleteById(Long id);
}
