package com.microservice.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.productservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
