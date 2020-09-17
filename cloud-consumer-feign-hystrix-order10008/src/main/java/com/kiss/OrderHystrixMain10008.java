package com.kiss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName OrderHystrixMain10008
 * @Description TODO
 * @Author kiss
 * @Date 2020/8/25 20:08
 * @Version 1.0
 */
@EnableHystrix
@EnableFeignClients
@SpringBootApplication
public class OrderHystrixMain10008
{
    public static void main(String[] args)
    {
        SpringApplication.run(OrderHystrixMain10008.class,args);
    }
}
