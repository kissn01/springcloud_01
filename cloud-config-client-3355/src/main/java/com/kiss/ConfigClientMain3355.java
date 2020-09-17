package com.kiss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName ConfigClientMain3355
 * @Description TODO
 * @Author kiss
 * @Date 2020/9/15 19:34
 * @Version 1.0
 */
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientMain3355
{
    public static void main(String[] args) {
        SpringApplication.run( ConfigClientMain3355.class,args);
    }

}
