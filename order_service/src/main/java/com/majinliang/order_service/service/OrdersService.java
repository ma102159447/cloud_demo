package com.majinliang.order_service.service;

import com.majinliang.order_service.pojo.Orders;
import org.springframework.core.annotation.Order;

public interface OrdersService {
    Orders getById(Integer id);
}
