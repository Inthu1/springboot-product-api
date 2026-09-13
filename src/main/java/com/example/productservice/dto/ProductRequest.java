package com.example.productservice.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductRequest {

    private String name;
    private String description;
    private BigDecimal price;
    private Integer quantity;
    private String category;

    // getters and setters
}