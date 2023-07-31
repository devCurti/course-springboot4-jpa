package com.devCurti.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devCurti.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	

}
