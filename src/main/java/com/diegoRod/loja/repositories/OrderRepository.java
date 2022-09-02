package com.diegoRod.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegoRod.loja.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
