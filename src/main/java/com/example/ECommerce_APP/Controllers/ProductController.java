package com.example.ECommerce_APP.Controllers;


import com.example.ECommerce_APP.Models.Product;
import com.example.ECommerce_APP.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ProductController {

    @Autowired
    ProductService productService;
// /getCostlyProduct?category=Makeup

    @GetMapping("/getCostlyProduct")
    public String getCostlyProduct(@RequestParam String category,@RequestParam int id ){

        return productService.getCostlyProduct(category,id );
    }
}
