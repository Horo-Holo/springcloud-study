package com.yuukin.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Yuukin
 * @data 2023/1/8 11:28
 */
@Configuration
@MapperScan({"com.yuukin.springcloud.dao"})
public class MyBatisConfig {
}