package com.kiss.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName OrderZKMain10002
 * @Description TODO
 * @Author kiss
 * @Date 2020/8/3 15:02
 * @Version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderZKMain10002
{
    public static void main(String[] args) {
        SpringApplication.run(OrderZKMain10002.class,args);
    }

}
