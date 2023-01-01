package com.yuukin.springcloud.service;

import com.yuukin.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author Yuukin
 * @data 2022/12/31 14:05
 */
public interface PaymentService {
    /**
     * 增加订单信息
     * @param payment 订单实体
     * @return
     */
    public int create(Payment payment);

    /**
     * 根据id获取订单信息
     * @param id id
     * @return
     */
    public Payment getPaymentById(@Param("id") Long id);
}
