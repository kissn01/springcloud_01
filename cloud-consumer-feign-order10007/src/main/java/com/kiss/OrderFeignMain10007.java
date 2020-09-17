package com.kiss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName OrderFeignMain10007
 * @Description TODO
 * @Author kiss
 * @Date 2020/8/25 10:26
 * @Version 1.0
 */
@EnableFeignClients
@SpringBootApplication
public class OrderFeignMain10007
{
    public static void main(String[] args)
    {
        SpringApplication.run(OrderFeignMain10007.class,args);
    }
}
