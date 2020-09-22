package com.kiss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName NacosConfigClientMain3377
 * @Description TODO
 * @Author kiss
 * @Date 2020/9/21 15:51
 * @Version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigClientMain3377
{
    public static void main(String[] args)
    {
        SpringApplication.run(NacosConfigClientMain3377.class,args);
    }
}
