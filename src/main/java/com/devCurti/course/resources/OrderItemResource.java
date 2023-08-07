package com.devCurti.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devCurti.course.entities.OrderItem;
import com.devCurti.course.services.OrderItemServices;

@RestController
@RequestMapping(value = "/orderItem")
public class OrderItemResource {
	
	@Autowired
	private OrderItemServices service;
	
	@GetMapping
	public ResponseEntity<List<OrderItem>> findAll(){
		List<OrderItem> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<OrderItem> findById(@PathVariable Long id){
		OrderItem u = service.findById(id);
		return ResponseEntity.ok().body(u);
	}
}
