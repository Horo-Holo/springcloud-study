package com.yuukin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Yuukin
 * @data 2023/1/7 15:56
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9005 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9005.class, args);
    }
}
