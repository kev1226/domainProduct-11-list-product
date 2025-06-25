package com.tecnoshop.listProducts.service;

import com.tecnoshop.listProducts.dto.ProductDTO;
import com.tecnoshop.listProducts.model.Product;
import com.tecnoshop.listProducts.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<Product> getAll() {
        return repo.findByDeletedAtIsNull();
    }

}
