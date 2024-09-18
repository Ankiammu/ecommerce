package com.project.ecommerce.service;

import com.project.ecommerce.dto.Products;
import com.project.ecommerce.model.Product;
import com.project.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public ResponseEntity<String> addProduct(Product request) {

        Products product = Products.builder().product_name(request.getProductName())
                .product_description(request.getProductDesc())
                .product_price(Long.valueOf(request.getPrice()))
                .product_status_id(1)
                .category_id(request.getCategoryId())
                .created_by(request.getCreatedBy())
                .created_timestamp(LocalDateTime.now()).build();
        productRepository.save(product);
        return new ResponseEntity<>("Product Added to Catalog Successfully", HttpStatus.OK);
    }
}
