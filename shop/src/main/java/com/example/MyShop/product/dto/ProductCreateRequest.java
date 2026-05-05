package com.example.MyShop.product.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ProductCreateRequest {
    private String productName;
    private int productPrice;
    private int count;
}
