package com.xiaowu.clouddemo.cloudorder.controller;

import com.xiaowu.clouddemo.common.dto.CommonResult;
import com.xiaowu.clouddemo.common.dto.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * @author 吴家峰
 * @version 1.0 2021-01-12:11:09
 * @see
 * @since 1.0
 */
@Controller
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;
    @Value("${micservicename.paymentServiceName}")
    private String paymentService;
    
    @ResponseBody
    @RequestMapping("/consumer/create")
    public CommonResult<Payment> createPayment(Payment payment) {
        return restTemplate.postForObject(getRequestUrlPrefix() + "/payment/create", payment, CommonResult.class);
    }
    
    @ResponseBody
    @RequestMapping("/consumer/query/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") String paymentId) {
        return restTemplate.getForObject(getRequestUrlPrefix() + "/payment/query/" + paymentId, CommonResult.class);
    }
    
    /**
     * 拼接成:http://ip:port
     * @return
     */
    private String getRequestUrlPrefix(){
        return "http://" + this.paymentService;
    }
}
