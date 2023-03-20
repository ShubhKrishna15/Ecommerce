package com.example.ECommerce_APP.Services;


import com.example.ECommerce_APP.Models.User;
import com.example.ECommerce_APP.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String createUser(User user){

        userRepository.save(user);

        return "User is created";


    }
}
