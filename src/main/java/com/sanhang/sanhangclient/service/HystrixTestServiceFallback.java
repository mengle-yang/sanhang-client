package com.sanhang.sanhangclient.service;

import org.springframework.stereotype.Service;

@Service
public class HystrixTestServiceFallback implements TestService {
    @Override
    public String test(String name) {
        return "Hello, " + name;
    }
}
