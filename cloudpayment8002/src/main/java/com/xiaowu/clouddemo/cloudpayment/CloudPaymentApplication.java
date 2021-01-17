package com.xiaowu.clouddemo.cloudpayment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 其中@MapperScan指定扫描特定路径下mapper接口,也可以不配置@MapperScan而是在mapper接口上使用
 * @mapper
 * @author 吴家峰
 * @version 1.0 2021-01-11:21:39
 * @see
 * @since 1.0
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.xiaowu.clouddemo.cloudpayment.dao"})
@EnableEurekaClient
@EnableDiscoveryClient
public class CloudPaymentApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudPaymentApplication.class);
    }
}
