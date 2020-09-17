package com.kiss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName OrderConsulMain10006
 * @Description TODO
 * @Author kiss
 * @Date 2020/8/24 16:37
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain10006
{
    public static void main(String[] args) {
        SpringApplication.run(OrderConsulMain10006.class,args);
    }

}
