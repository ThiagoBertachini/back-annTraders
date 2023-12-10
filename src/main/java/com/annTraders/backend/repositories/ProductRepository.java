package com.annTraders.backend.repositories;

import com.annTraders.backend.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}