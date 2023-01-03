package com.yuukin.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author Yuukin
 * @data 2023/1/3 16:14
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfoOk(Integer id) {
        return "----------------PaymentFallbackService  fall back--paymentInfoOk  /(ㄒoㄒ)/~~";
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return "----------------PaymentFallbackService  fall back--paymentInfoTimeOut  /(ㄒoㄒ)/~~";
    }
}
