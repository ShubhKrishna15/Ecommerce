package com.example.ECommerce_APP.Controllers;


import com.example.ECommerce_APP.Models.User;
import com.example.ECommerce_APP.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name="/User")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public String createUser(@RequestBody User user){

        return userService.createUser(user);
    }


}
