package com.example.CursoJava_Final.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CursoJava_Final.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
