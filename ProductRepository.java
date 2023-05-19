package com.prasuna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prasuna.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
