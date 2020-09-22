package com.kiss.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ConfigClientController
 * @Description TODO
 * @Author kiss
 * @Date 2020/9/21 15:53
 * @Version 1.0
 */
@RefreshScope
@RestController
public class ConfigClientController
{
    @Value("${config.info}")
    private String  configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo()
    {
        return configInfo;
    }

}
