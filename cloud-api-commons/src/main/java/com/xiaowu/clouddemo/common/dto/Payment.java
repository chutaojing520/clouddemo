package com.xiaowu.clouddemo.common.dto;

import java.io.Serializable;

/**
 * @author 吴家峰
 * @version 1.0 2021-01-12:13:23
 * @see
 * @since 1.0
 */
public class Payment implements Serializable {
    private static final long serialVersionUID = 5151206316889608863L;
    //支付主键
    private long paymentId;
    //支付序列号
    private String paymentSerial;
    
    public long getPaymentId() {
        return paymentId;
    }
    
    public void setPaymentId(long paymentId) {
        this.paymentId = paymentId;
    }
    
    public String getPaymentSerial() {
        return paymentSerial;
    }
    
    public void setPaymentSerial(String paymentSerial) {
        this.paymentSerial = paymentSerial;
    }
}
