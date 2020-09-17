package com.kiss.springcloud.service.impl;

import com.kiss.springcloud.dao.PaymentDao;
import com.kiss.springcloud.entities.Payment;
import com.kiss.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName PaymentServiceImpl
 * @Description TODO
 * @Author kiss
 * @Date 2020/8/1 10:13
 * @Version 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService
{
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById( Long id){

        return paymentDao.getPaymentById(id);

    }

}
