package com.springbootestudo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootestudo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
