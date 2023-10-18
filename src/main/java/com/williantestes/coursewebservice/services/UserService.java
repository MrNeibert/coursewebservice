package com.williantestes.coursewebservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.williantestes.coursewebservice.entities.User;
import com.williantestes.coursewebservice.repositories.UserRepository;

@Service
public class UserService {

  @Autowired
  private UserRepository repository;

  public List<User> findAll() {
    return repository.findAll();
  }

  public User findById(Long id) {
    Optional<User> obj = repository.findById(id);
    return obj.get();
  }

  public User insert(User obj) {
    return repository.save(obj);
  }

  public void delete(Long Id){
    repository.deleteById(Id);
  }

}
