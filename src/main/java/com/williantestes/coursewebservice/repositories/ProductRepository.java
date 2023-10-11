package com.williantestes.coursewebservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williantestes.coursewebservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{
  
}
