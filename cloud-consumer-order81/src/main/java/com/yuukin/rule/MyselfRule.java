package com.yuukin.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Yuukin
 * @data 2023/1/2 13:30
 */
@Configuration
public class MyselfRule {
    @Bean
    public IRule myRule() {
        /**
         * 随机
         */
        return new RandomRule();
    }
}
