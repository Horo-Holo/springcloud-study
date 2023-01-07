package com.yuukin.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.yuukin.springcloud.entities.CommonResult;
import com.yuukin.springcloud.entities.Payment;

/**
 * @author Yuukin
 * @data 2023/1/7 15:33
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444, "按客户自定义,global handlerException---1", new Payment(2020L, "serial003"));
    }
    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444, "按客户自定义,global handlerException---2", new Payment(2020L, "serial003"));
    }
}
