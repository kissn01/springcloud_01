package com.kiss.controller;

import com.kiss.springcloud.entities.CommonResult;
import com.kiss.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @ClassName PaymentController
 * @Description TODO
 * @Author kiss
 * @Date 2020/9/23 16:28
 * @Version 1.0
 */
@RestController
public class PaymentController
{
    @Value("${server.port}")
    private String serverPort;

    public static HashMap<Long,Payment> paymentHashMap = new HashMap<>();
    static{
        paymentHashMap.put(1L,new Payment(1L,"28a8c1e3bc2742d8848569891fb42181"));
        paymentHashMap.put(2L,new Payment(2L,"bba8c1e3bc2742d8848569891ac32182"));
        paymentHashMap.put(3L,new Payment(3L,"6ua8c1e3bc2742d8848569891xt92183"));

    }

    @GetMapping("/paymentSQL/{id}")
    public  CommonResult<Payment> paymentSQL(@PathVariable("id") Long id){
        Payment payment = paymentHashMap.get(id);
        CommonResult<Payment> result = new CommonResult(200,"from mysql,serverPort:  "+serverPort,payment);
        return result;
    }

}
