package com.diegoRod.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegoRod.loja.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
