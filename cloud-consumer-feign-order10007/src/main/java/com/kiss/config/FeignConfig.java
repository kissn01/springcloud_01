package com.kiss.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName FeignConfig
 * @Description TODO
 * @Author kiss
 * @Date 2020/8/25 11:22
 * @Version 1.0
 */

@Configuration
public class FeignConfig
{
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
