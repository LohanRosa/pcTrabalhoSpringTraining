package com.springbootestudo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootestudo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
