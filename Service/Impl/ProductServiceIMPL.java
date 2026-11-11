package com.example.productmanagement.Service.Impl;

import com.example.productmanagement.Entity.Product;
import com.example.productmanagement.Repository.ProductRepo;
import com.example.productmanagement.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceIMPL implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<Product>getAll(){
        return productRepo.findAll();
    }
    @Override
    public Product getById(Long id) {
        return productRepo.findById(id).orElseThrow(() ->  new RuntimeException("Không tìm thấy sản phẩm"));
    }

    @Override
    public Product createProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public void deleteProductById(Long id) {
        productRepo.deleteById(id);
    }
}
