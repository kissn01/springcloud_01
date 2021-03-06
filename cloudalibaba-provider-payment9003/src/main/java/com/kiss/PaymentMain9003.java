package com.kiss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName PaymentMain9003
 * @Description TODO
 * @Author kiss
 * @Date 2020/9/23 16:26
 * @Version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain9003
{
    public static void main(String[] args)
    {
        SpringApplication.run(PaymentMain9003.class, args);
    }
}
