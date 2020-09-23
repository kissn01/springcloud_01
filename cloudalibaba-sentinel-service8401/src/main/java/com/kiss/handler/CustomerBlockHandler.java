package com.kiss.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.kiss.springcloud.entities.CommonResult;

/**
 * @ClassName customerBlockHandler
 * @Description TODO
 * @Author kiss
 * @Date 2020/9/23 15:42
 * @Version 1.0
 */
public class CustomerBlockHandler
{
    public static CommonResult handlerException(BlockException blockException)
    {
        return new CommonResult(2020,"客戶自定义限流方法...");
    }
}
