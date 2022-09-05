package com.diegoRod.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegoRod.loja.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
