package com.kiss.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName FlowLimitController
 * @Description TODO
 * @Author kiss
 * @Date 2020/9/22 17:22
 * @Version 1.0
 */
@Slf4j
@RestController
public class FlowLimitController
{
    @RequestMapping("/testA")
    public String testA()
    {
        
        return "===============TestA()";
    }

    @RequestMapping("/testB")
    public String testB()
    {

        return "===============TestB()";
    }


    @GetMapping("/testD")
    public String testD()
    {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        log.info("testD 测试RT");

        return "------testD";
    }

    @GetMapping("/testE")
    public String testE()
    {
        log.info("testE 测试异常比例");
        int age = 10/0;
        return "------testE";
    }

    @GetMapping("/testF")
    public String testF()
    {
        log.info("testD 测试异常数");
        int age = 10/0;
        return "------testF";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value = "p1",required = false) String p1, @RequestParam(value = "p2",required = false) String p2)
    {

        return "------testHotKey";
    }


    //兜底方法
    public String deal_testHotKey (String p1, String p2, BlockException exception)
    {
        return "------deal_testHotKey,o(╥﹏╥)o";
    }



}
