package com.example.ECommerce_APP.Controllers;


import com.example.ECommerce_APP.Models.Order;
import com.example.ECommerce_APP.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class OrderController {

    @Autowired
    OrderService orderService;


}
