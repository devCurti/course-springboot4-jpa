package com.devCurti.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devCurti.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
