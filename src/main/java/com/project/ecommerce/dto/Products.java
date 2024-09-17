package com.project.ecommerce.dto;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Products {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long product_id;
    private String product_name;
    private Long product_price;
    private String product_description;
    private int category_id;
    private int product_status_id;
    private String created_by;
    private LocalDateTime created_timestamp;

}
