package com.yuukin.springcloud.service.impl;

import com.yuukin.springcloud.dao.PaymentDao;
import com.yuukin.springcloud.entities.Payment;
import com.yuukin.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Yuukin
 * @data 2022/12/31 14:05
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
