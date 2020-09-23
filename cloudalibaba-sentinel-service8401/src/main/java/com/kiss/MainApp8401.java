package com.kiss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName MainApp8401
 * @Description TODO
 * @Author kiss
 * @Date 2020/9/22 17:20
 * @Version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MainApp8401
{
    public static void main(String[] args)
    {
        SpringApplication.run(MainApp8401.class, args);
    }
}
