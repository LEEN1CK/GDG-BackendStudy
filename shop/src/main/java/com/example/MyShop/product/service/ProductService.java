package com.example.MyShop.product.service;

import com.example.MyShop.product.dto.ProductCreateRequest;
import com.example.MyShop.product.dto.ProductUpdateRequest;
import com.example.MyShop.product.entity.Product;

import java.util.List;

public interface ProductService {
    Long createProduct(ProductCreateRequest productCreateRequest);
    Product getProductById(Long id);
    List<Product> getAllProducts();
    void updateProduct(Long id, ProductUpdateRequest productUpdateRequest);
    void deleteProduct(Long id);
}
