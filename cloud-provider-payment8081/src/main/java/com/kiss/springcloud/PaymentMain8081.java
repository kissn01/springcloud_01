package com.kiss.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName PaymentMain8081
 * @Description TODO
 * @Author kiss
 * @Date 2020/7/31 20:06
 * @Version 1.0
 */
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain8081
{
    public static void main(String[] args)
    {
        SpringApplication.run(PaymentMain8081.class,args);
    }


}
