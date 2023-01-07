package com.yuukin.springcloud.service;

import com.yuukin.springcloud.entities.CommonResult;
import com.yuukin.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author Yuukin
 * @data 2023/1/7 16:32
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444, "服务降级返回,没有该流水信息", new Payment(id, "errorSerial......"));
    }
}
