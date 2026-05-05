package com.example.MyShop.product.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ProductUpdateRequest {
    private String productName;
    private Integer productPrice;
    private Integer count;
}
