package com.example.productmanagement.Service;

import com.example.productmanagement.Entity.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
    Product getById(Long id);
    Product createProduct(Product product);
    void delete(Long id);
}
