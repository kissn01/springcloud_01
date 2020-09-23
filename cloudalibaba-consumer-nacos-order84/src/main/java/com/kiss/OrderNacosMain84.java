package com.kiss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName OrderNacosMain84
 * @Description TODO
 * @Author kiss
 * @Date 2020/9/23 16:45
 * @Version 1.0
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class OrderNacosMain84
{
    public static void main(String[] args)
    {
        SpringApplication.run(OrderNacosMain84.class,args);
    }
}
