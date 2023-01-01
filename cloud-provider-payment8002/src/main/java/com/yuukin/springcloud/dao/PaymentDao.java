package com.yuukin.springcloud.dao;

import com.yuukin.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Yuukin
 * @data 2022/12/31 13:52
 */
@Mapper
public interface PaymentDao {
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
