package com.example.productmanagement.Controller;

import com.example.productmanagement.Entity.Product;
import com.example.productmanagement.Service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/get-all-product")
    public ResponseEntity<List<Product>> getAllProduct() {
        List<Product> listProduct = productService.getAll();
        return ResponseEntity.ok().body(listProduct);
    }
    @GetMapping("/get-by-id")
    public ResponseEntity<Product> getProductById(Long id) {
        Product product = productService.getById(id);
        return ResponseEntity.ok(product);
    }
    @PostMapping("/create-new-product")
    public ResponseEntity<Product> createNewProduct(@RequestBody Product product) {
        Product createProduct = productService.createProduct(product);
        return ResponseEntity.ok(createProduct);
    }
    @DeleteMapping("/Delete-by=id")
    public ResponseEntity<?> deleteProductById(@PathVariable Long id) {
        productService.delete(id);
        return ResponseEntity.ok().build();
    }
}
