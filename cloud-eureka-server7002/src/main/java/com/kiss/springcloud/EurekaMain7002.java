package com.kiss.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName com.kiss.springcloud.EurekaMain7002
 * @Description TODO
 * @Author kiss
 * @Date 2020/8/1 16:43
 * @Version 1.0
 */

@EnableEurekaServer
@SpringBootApplication
public class EurekaMain7002
{
    public static void main(String[] args)
    {
        SpringApplication.run(EurekaMain7002.class,args);
    }
}
