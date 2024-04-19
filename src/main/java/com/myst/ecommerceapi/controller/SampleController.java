package com.myst.ecommerceapi.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class SampleController {

    @GetMapping("/test")
    public String testHello() {
        return "test";
    }

    @GetMapping("/test2")
    public String testHello2() {
        return "test2";
    }

}
