package com.yuukin.springcloud;

import com.yuukin.springcloud.entities.Payment;
import com.yuukin.springcloud.service.PaymentService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author Yuukin
 * @data 2022/12/31 14:21
 */
@SpringBootTest
public class PaymentMain8001 {

    @Resource
    private PaymentService paymentService;

    @Test
    public void test() {
        Payment pa = paymentService.getPaymentById(31L);
        System.out.println(pa);
    }
}
