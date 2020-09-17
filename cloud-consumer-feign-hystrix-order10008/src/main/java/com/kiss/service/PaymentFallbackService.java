package com.kiss.service;

import org.springframework.stereotype.Component;

/**
 * @ClassName PaymentFallbackService
 * @Description TODO
 * @Author kiss
 * @Date 2020/9/10 15:11
 * @Version 1.0
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService
{

    @Override
    public String paymentInfo_OK(Integer id)
    {
        return "---PaymentHystrixService fallback paymentInfo_OK()  (┬＿┬) ---";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id)
    {
        return "---PaymentHystrixService fallback paymentInfo_TimeOut()  (┬＿┬) ---";
    }
}
