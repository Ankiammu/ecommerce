package com.project.ecommerce.model;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
public class Product {

    private String productName;
    private String price;
    private String productDesc;
    private int categoryId;
    private String createdBy;

}
