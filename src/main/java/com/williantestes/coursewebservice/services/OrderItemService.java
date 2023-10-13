package com.williantestes.coursewebservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.williantestes.coursewebservice.entities.OrderItem;
import com.williantestes.coursewebservice.repositories.OrderItemRepository;

@Service
public class OrderItemService {

  
  @Autowired
  private OrderItemRepository repository;

  public List<OrderItem> findAll(){
    return repository.findAll();
  }

  public OrderItem findById(Long id) {
		Optional<OrderItem> obj = repository.findById(id);
		return obj.get();
	}
}
