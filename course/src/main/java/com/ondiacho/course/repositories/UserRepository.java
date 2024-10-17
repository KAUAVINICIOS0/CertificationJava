package com.ondiacho.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ondiacho.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
