package com.sanhang.sanhangclient.ctrl;

import com.sanhang.sanhangclient.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCtrl {

    @Autowired
    private TestService testService;

    @GetMapping("test-c")
    public String testC(String name) {
        return testService.test(name);
    }
}
