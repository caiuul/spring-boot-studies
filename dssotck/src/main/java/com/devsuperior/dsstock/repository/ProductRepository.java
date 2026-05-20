package com.devsuperior.dsstock.repository;

import com.devsuperior.dsstock.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
}
