package com.springboot.pmgnt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.pmgnt.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
