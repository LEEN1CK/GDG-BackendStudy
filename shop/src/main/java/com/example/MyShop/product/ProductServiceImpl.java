package com.example.MyShop.product.service;

import com.example.MyShop.product.dto.ProductCreateRequest;
import com.example.MyShop.product.dto.ProductUpdateRequest;
import com.example.MyShop.product.entity.Product;
import com.example.MyShop.product.repository.JpaProductRepository;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

    private final JpaProductRepository productRepository;

    @Override
    @Transactional
    public Long createProduct(ProductCreateRequest request) {
        Product product = new Product(
                request.getProductName(),
                request.getProductPrice(),
                request.getCount()
        );
        productRepository.save(product);
        return product.getId();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Product getProductById(Long id) {
        Product product = productRepository.findById(id);
        if (product == null) {
            throw new RuntimeException("상품을 찾을 수 없습니다.");
        }
        return product;
    }

    @Override
    @Transactional
    public void updateProduct(Long id, ProductUpdateRequest request) {
        Product product = productRepository.findById(id);
        if (product == null) {
            throw new RuntimeException("상품을 찾을 수 없습니다.");
        }
        product.updateInfo(request.getProductName(), request.getProductPrice(), request.getCount());
    }

    @Override
    @Transactional
    public void deleteProduct(Long id) {
        Product product = productRepository.findById(id);
        if (product == null) {
            throw new RuntimeException("상품을 찾을 수 없습니다.");
        }
        productRepository.deleteById(id);
    }
}