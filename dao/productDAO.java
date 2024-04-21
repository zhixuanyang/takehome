package com.pilot.product.dao;

import com.pilot.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productDAO extends JpaRepository<Product, Integer> {
}
