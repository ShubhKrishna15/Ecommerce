package com.example.ECommerce_APP.Repositories;

import com.example.ECommerce_APP.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
