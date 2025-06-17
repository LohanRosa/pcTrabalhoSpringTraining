package com.springbootestudo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootestudo.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
