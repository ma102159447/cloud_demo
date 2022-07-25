package com.majinliang.order_service.service.impl;

import com.majinliang.order_service.mapper.OrdersMapper;
import com.majinliang.order_service.pojo.Orders;
import com.majinliang.order_service.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    OrdersMapper mapper;
    @Override
    public Orders getById(Integer id) {
        return mapper.getById(id);
    }
}
