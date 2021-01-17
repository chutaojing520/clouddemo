package com.xiaowu.clouddemo.cloudpayment.service;

import com.xiaowu.clouddemo.common.dto.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    /**
     * 新增一条支付记录
     *
     * @param payment
     * @return
     */
    int createPayment(Payment payment);
    
    /**
     * 根据支付记录主键查询记录
     *
     * @param paymentId
     * @return
     */
    Payment getPaymentById(@Param("paymentId") String paymentId);
}
