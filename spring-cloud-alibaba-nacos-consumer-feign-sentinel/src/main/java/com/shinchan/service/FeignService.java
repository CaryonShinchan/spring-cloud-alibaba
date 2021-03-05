package com.shinchan.service;

import com.shinchan.service.impl.FallbackServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Administrator
 */
@FeignClient(value = "nacos-provider", fallback = FallbackServiceImpl.class)
public interface FeignService {

    /**
     * 测试方法
     * @param message 参数
     * @return String
     */
    @GetMapping(value = "/test/{message}")
    String test(@PathVariable("message") String message);

}
