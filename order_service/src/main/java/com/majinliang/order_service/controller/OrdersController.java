package com.majinliang.order_service.controller;

import com.majinliang.order_service.pojo.Orders;
import com.majinliang.order_service.pojo.User;
import com.majinliang.order_service.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order-service")
public class OrdersController {
    @Autowired
    OrdersService ordersService;
    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/{id}")
    public Orders getOrders(@PathVariable("id") int id){
        Orders orders = ordersService.getById(id);
        ResponseEntity<User> users = restTemplate.getForEntity("http://localhost:8081/user/" + orders.getUserId(), User.class);
        orders.setUser(users.getBody());
        return orders;
    }
}
