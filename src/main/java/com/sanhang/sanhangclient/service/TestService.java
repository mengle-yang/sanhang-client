package com.sanhang.sanhangclient.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "sanhang-server", fallback = HystrixTestServiceFallback.class)
public interface TestService {

    @GetMapping("/test")
    String test(@RequestParam String name);
}


