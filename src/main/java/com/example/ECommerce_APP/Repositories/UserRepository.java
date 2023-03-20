package com.example.ECommerce_APP.Repositories;

import com.example.ECommerce_APP.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {


}
