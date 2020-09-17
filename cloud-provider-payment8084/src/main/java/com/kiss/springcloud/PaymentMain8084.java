package com.kiss.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName PaymentMain8084
 * @Description TODO
 * @Author kiss
 * @Date 2020/8/3 14:35
 * @Version 1.0
 */

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8084
{
    public static void main(String[] args)
    {
        SpringApplication.run(PaymentMain8084.class,args);
    }
}
