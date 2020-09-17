package com.kiss.springcloud.service;

import com.kiss.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName PaymentService
 * @Description TODO
 * @Author kiss
 * @Date 2020/8/1 10:12
 * @Version 1.0
 */
public interface PaymentService
{
     int create(Payment payment);

     Payment getPaymentById(@Param("id") Long id);

}
