package com.kiss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName GateWayMain9527
 * @Description TODO
 * @Author kiss
 * @Date 2020/9/11 14:58
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527
{
    public static void main(String[] args) {
        SpringApplication.run( GateWayMain9527.class,args);
    }

}
