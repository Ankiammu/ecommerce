package com.project.ecommerce.controller;

import com.project.ecommerce.model.Product;
import com.project.ecommerce.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/products")
public class
ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/fetch")
    public ResponseEntity<String> fetchProducts() {
        return new ResponseEntity<>("hello", HttpStatus.OK);
    }

    @PostMapping(value = "/add",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> addProducts(@RequestBody Product request) {
        return service.addProduct(request);
    }
}
