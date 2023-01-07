package com.yuukin.springcloud.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * @author Yuukin
 * @data 2023/1/7 14:23
 */
@Service
public class SentinelService {

    @SentinelResource("myresource")
    public String sentinelChain() {
        return "调用资源成功！";
    }
}
