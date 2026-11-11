package com.example.productmanagement.Entity;

import com.example.productmanagement.Common.CategoryStatus;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "category_name")
    private String name;

    @Column(name = "brand")
    private String brand;

    @Column(name = "status")
    private CategoryStatus categoryStatus;
}
