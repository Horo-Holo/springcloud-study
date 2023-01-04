package com.yuukin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Yuukin
 * @data 2023/1/4 16:26
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigMain3366 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigMain3366.class, args);
    }
}
