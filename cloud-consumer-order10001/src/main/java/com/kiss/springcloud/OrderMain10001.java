package com.kiss.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName OrderMain10001
 * @Description TODO
 * @Author kiss
 * @Date 2020/8/1 11:04
 * @Version 1.0
 */

@EnableEurekaClient
@SpringBootApplication
public class OrderMain10001
{
    public static void main(String[] args)
    {
        SpringApplication.run(OrderMain10001.class,args);
    }
}
