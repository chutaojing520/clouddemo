package com.xiaowu.clouddemo.cloudpayment.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.converters.Auto;
import com.xiaowu.clouddemo.cloudpayment.service.PaymentService;
import com.xiaowu.clouddemo.common.dto.CommonResult;
import com.xiaowu.clouddemo.common.dto.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 吴家峰
 * @version 1.0 2021-01-11:23:18
 * @see
 * @since 1.0
 */
@Controller
public class PaymentController {
    @Value("${spring.application.name}")
    private String serviceName;
    @Value("${server.port}")
    private String port;
    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private PaymentService paymentService;
    
    @ResponseBody
    @PostMapping("/payment/create")
    public CommonResult createPayment(@RequestBody Payment payment) {
        int count = paymentService.createPayment(payment);
        if (count == 1) {
            return new CommonResult(200, this.port + "端口新增数据成功", count);
        } else {
            return new CommonResult(555, this.port + "端口新增数据失败", null);
        }
    }
    
    @ResponseBody
    @RequestMapping("/payment/query/{id}")
    public CommonResult getPaymentById(@PathVariable("id") String paymentId) {
        Payment payment = paymentService.getPaymentById(paymentId);
        if (payment != null) {
            return new CommonResult(200, this.port + "端口查询成功", payment);
        } else {
            return new CommonResult(555, this.port + "端口没有对应的记录,查询id=" + paymentId, null);
        }
    }
    
    @ResponseBody
    @RequestMapping("/payment/discovery")
    public List<ServiceInstance> discovery() {
        List<String> services = discoveryClient.getServices();
        List<ServiceInstance> instances = new ArrayList<>();
        for (String service : services) {
            List<ServiceInstance> tempInstances = discoveryClient.getInstances(service);
            instances.addAll(tempInstances);
        }
        return instances;
    }
}
