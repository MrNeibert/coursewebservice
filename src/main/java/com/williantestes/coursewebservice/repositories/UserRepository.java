package com.williantestes.coursewebservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williantestes.coursewebservice.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{
  
}
