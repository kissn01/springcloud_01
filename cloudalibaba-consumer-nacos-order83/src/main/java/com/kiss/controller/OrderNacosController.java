package com.kiss.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName OrderNacosController
 * @Description TODO
 * @Author kiss
 * @Date 2020/9/21 15:33
 * @Version 1.0
 */
@Slf4j
@RestController
public class OrderNacosController
{
    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serverUrl;

    @GetMapping("consumer/payment/nacos/{id}")
    public String  paymentInfo(@PathVariable("id") Long id)
    {
        return restTemplate.getForObject(serverUrl+"/payment/nacos/"+id, String.class);
    }
}
