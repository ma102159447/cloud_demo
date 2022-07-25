package com.majinliang.controller;

import com.majinliang.pojo.User;
import com.majinliang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/{id}")
    public User getUser(@PathVariable  int id){
        return  userService.getUserById(id);
    }
}
