package com.xiaowu.clouddemo.cloudorder.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author 吴家峰
 * @version 1.0 2021-01-12:11:16
 * @see
 * @since 1.0
 */
@Configuration
public class OrderConfiguration {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
