package com.example.productmanagement.Repository;

import com.example.productmanagement.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
