package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author zsy
 * @version 1.0
 * @date 2020/4/22 21:23
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "------PaymentFallbackService fall back-paymentInfo_OK.0_0";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "------PaymentFallbackService fall back-paymentInfo_TimeOut.0_0";
    }
}
