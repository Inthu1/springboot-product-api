package com.example.productservice.service;

import com.example.productservice.dto.ProductResponse;
import com.example.productservice.dto.ProductRequest;
import java.util.List;

public interface ProductService {

    ProductResponse createProduct(ProductRequest request);

    List<ProductResponse> getAllProducts();

    ProductResponse getProduct(Long id);

    ProductResponse updateProduct(Long id, ProductRequest request);

    void deleteProduct(Long id);
}