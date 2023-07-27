package com.devCurti.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.devCurti.course.entities.User;
import com.devCurti.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User("Maria Brown", "maria@gmail.com", "999999", "12345");
		User u2 = new User("Carlos Brown", "carlos@gmail.com", "999999", "12345");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		
		
	}
}
