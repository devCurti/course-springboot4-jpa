package com.devCurti.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devCurti.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	

}
