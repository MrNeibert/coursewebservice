package com.williantestes.coursewebservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williantestes.coursewebservice.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long>{
  
}
