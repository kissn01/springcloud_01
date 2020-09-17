package com.kiss.springcloud.controller;

import com.kiss.springcloud.entities.CommonResult;
import com.kiss.springcloud.entities.Payment;
import com.kiss.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName PaymentController
 * @Description TODO
 * @Author kiss
 * @Date 2020/8/1 10:19
 * @Version 1.0
 */
@Slf4j
@RestController
public class PaymentController
{
    @Resource
    private PaymentService paymentService;

    @Resource
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String element : services) {
            log.info("***** element:"+element);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return this.discoveryClient;
    }

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment)
    {
        int result = paymentService.create(payment);
        log.info("********插入结果：{}", result);
        if(result > 0) {
            return new CommonResult(200,"插入数据库成功:"+serverPort,result);
        }else{
            return new CommonResult(400,"插入数据库失败.",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult  getPaymentById(@PathVariable("id") Long id)
    {
        Payment payment = paymentService.getPaymentById(id);
        log.info("********查询结果：{}", payment);
        if(null!= payment){
            return new CommonResult(200, "查询成功:"+serverPort,payment);
        }else{
            return new CommonResult(400, "此id 暂无数据.", null);
        }
    }

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout(){
        try { TimeUnit.SECONDS.sleep(3); }catch (Exception e) {e.printStackTrace();}
        return serverPort;
    }

    @GetMapping("/payment/lb")
    public String getPaymentLB()
    {
        return serverPort;
    }

}
