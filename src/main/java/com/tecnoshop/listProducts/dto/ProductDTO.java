package com.tecnoshop.listProducts.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    private String name;
    private String description;
    private Double price;
    private Integer stock;
    private String sku;
    private Boolean isPublished;
}
