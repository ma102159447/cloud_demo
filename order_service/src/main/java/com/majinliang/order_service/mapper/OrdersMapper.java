package com.majinliang.order_service.mapper;

import com.majinliang.order_service.pojo.Orders;

public interface OrdersMapper {
    Orders getById(Integer id);
}
