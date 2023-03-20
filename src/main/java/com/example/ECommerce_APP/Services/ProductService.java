package com.example.ECommerce_APP.Services;


import com.example.ECommerce_APP.Models.Order;
import com.example.ECommerce_APP.Models.Product;
import com.example.ECommerce_APP.Repositories.OrderRepository;
import com.example.ECommerce_APP.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {


    @Autowired
    ProductRepository productRepository;


    @Autowired
    OrderRepository orderRepository;
    public String getCostlyProduct(String category, int id){

        String maxPriceProductName  = "";
        int maxPrice = Integer.MAX_VALUE;

        Order order = orderRepository.findById(id).get();

        List<Product> reqProductList = order.getProductList();

        List<Product> sameCategoryProduct = new ArrayList<>();
        for(Product p : sameCategoryProduct){

            if(p.getCategory()==category){
                if(p.getPrice()>maxPrice){
                    maxPrice = p.getPrice();
                    maxPriceProductName = p.getName();
                }

            }
        }

        return maxPriceProductName;
    }
}
