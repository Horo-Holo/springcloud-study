package com.yuukin.springcloud.service;

import com.yuukin.springcloud.domain.Order;

/**
 * @author Yuukin
 * @data 2023/1/8 10:54
 */
public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);
}

