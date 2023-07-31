package com.devCurti.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.devCurti.course.entities.Category;
import com.devCurti.course.entities.Order;
import com.devCurti.course.entities.User;
import com.devCurti.course.entities.enums.OrderStatus;
import com.devCurti.course.repositories.CategoryRepository;
import com.devCurti.course.repositories.OrderRepository;
import com.devCurti.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Cars");
		Category cat3 = new Category(null, "Books");
		
		User u1 = new User("Maria Brown", "maria@gmail.com", "999999", "12345");
		User u2 = new User("Carlos Brown", "carlos@gmail.com", "999999", "12345");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.SHIPPED, u1);
		Order o2 = new Order(null, Instant.parse("2019-08-20T17:51:00Z"), OrderStatus.DELIVERED,u2);
		Order o3 = new Order(null, Instant.parse("2019-07-20T20:20:05Z"), OrderStatus.SHIPPED,u1);
		
		categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
		
		
		
	}
}
