package com.devCurti.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devCurti.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	

}
