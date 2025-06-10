package com.springbootestudo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootestudo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
