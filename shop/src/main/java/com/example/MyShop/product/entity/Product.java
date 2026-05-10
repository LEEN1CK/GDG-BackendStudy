package com.example.MyShop.product;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

    @Column(name = "product_name", length = 200)
    private String productName;

    @Column(name = "product_price")
    private int productPrice;

    @Column(name = "count")
    private int count;

    public Product(String productName, int productPrice, int count) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.count = count;
    }

    public void updateInfo(String productName, Integer productPrice, Integer count) {
        if (productName != null) {
            this.productName = productName;
        }
        if (productPrice != null) {
            this.productPrice = productPrice;
        }
        if (count != null) {
            this.count = count;
        }
    }
}
