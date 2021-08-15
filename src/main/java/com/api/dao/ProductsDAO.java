package com.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.entitys.Product;

public interface ProductsDAO extends JpaRepository<Product, Long> {

}
