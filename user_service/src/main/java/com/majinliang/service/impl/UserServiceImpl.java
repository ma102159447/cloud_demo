package com.majinliang.service.impl;

import com.majinliang.mapper.UserMapper;
import com.majinliang.pojo.User;
import com.majinliang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper mapper;
    @Override
    public User getUserById(int id) {
        return mapper.getUserById(id);
    }
}
