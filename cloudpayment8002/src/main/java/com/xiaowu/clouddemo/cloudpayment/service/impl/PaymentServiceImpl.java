package com.xiaowu.clouddemo.cloudpayment.service.impl;

import com.xiaowu.clouddemo.cloudpayment.dao.PaymentMapper;
import com.xiaowu.clouddemo.cloudpayment.service.PaymentService;
import com.xiaowu.clouddemo.common.dto.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 吴家峰
 * @version 1.0 2021-01-11:23:15
 * @see
 * @since 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentMapper paymentMapper;
    
    @Override
    public int createPayment(Payment payment) {
        return paymentMapper.createPayment(payment);
    }
    
    @Override
    public Payment getPaymentById(String paymentId) {
        return paymentMapper.getPaymentById(paymentId);
    }
}
