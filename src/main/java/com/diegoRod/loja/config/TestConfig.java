package com.diegoRod.loja.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.diegoRod.loja.entities.User;
import com.diegoRod.loja.repositories.UserRepository;

@Configuration
@Profile ("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
	
		User u1 = new User(null, "Renan Almeida", "nanam@gmail.com", "988888888", "12345");
		User u2 = new User(null, "Isabella Almeida", "isa@gmail.com", "977777777", "12345");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
