package com.example.ECommerce_APP.Repositories;

import com.example.ECommerce_APP.Models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
