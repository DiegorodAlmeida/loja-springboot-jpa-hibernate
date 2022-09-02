package com.diegoRod.loja.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.diegoRod.loja.entities.Order;
import com.diegoRod.loja.entities.User;
import com.diegoRod.loja.repositories.OrderRepository;
import com.diegoRod.loja.repositories.UserRepository;

@Configuration
@Profile ("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
	
		User u1 = new User(null, "Renan Almeida", "nanam@gmail.com", "988888888", "12345");
		User u2 = new User(null, "Isabella Almeida", "isa@gmail.com", "977777777", "12345");
		
		Order o1 = new Order(null, Instant.parse("2022-06-20T19:53:07Z"), u1);
		Order o2 = new Order(null, Instant.parse("2022-07-21T03:42:10Z"), u2);
		Order o3 = new Order(null, Instant.parse("2022-07-22T15:21:22Z"), u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
}
