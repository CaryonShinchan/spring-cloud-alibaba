package com.shinchan.service.impl;

import com.shinchan.service.FeignService;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 */
@Component
public class FallbackServiceImpl implements FeignService {

    @Override
    public String test(String message) {
        return "System error! Please wait.";
    }
}
