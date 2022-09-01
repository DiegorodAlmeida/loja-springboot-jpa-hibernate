package com.diegoRod.loja.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diegoRod.loja.entities.User;

@RestController
@RequestMapping (value= "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll (){
		
		User u = new User(null, "Renan", "renan@gmail.com", "99939130", "nanam");
		return ResponseEntity.ok().body(u);
	}

}
