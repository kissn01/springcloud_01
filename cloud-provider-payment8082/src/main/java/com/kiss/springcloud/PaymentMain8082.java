package com.kiss.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName PaymentMain8081
 * @Description TODO
 * @Author kiss
 * @Date 2020/7/31 20:06
 * @Version 1.0
 */
@EnableEurekaClient
@SpringBootApplication
public class PaymentMain8082
{
    public static void main(String[] args)
    {
        SpringApplication.run(PaymentMain8082.class,args);
    }


}
