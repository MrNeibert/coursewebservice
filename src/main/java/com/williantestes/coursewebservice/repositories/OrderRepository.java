package com.williantestes.coursewebservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williantestes.coursewebservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{
  
}
