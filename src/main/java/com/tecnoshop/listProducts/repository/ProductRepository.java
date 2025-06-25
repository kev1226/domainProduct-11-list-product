package com.tecnoshop.listProducts.repository;

import com.tecnoshop.listProducts.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByDeletedAtIsNull(); // productos activos
}
