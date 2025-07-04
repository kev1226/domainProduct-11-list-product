package com.tecnoshop.listProducts.controller;

import com.tecnoshop.listProducts.dto.ProductDTO;
import com.tecnoshop.listProducts.model.Product;
import com.tecnoshop.listProducts.service.ProductService;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final StockService service;

    public ProductController(StockService service) {
        this.service = service;
    }

    @GetMapping
    public List<Product> getAll() {
        return service.getAll();
    }

}
