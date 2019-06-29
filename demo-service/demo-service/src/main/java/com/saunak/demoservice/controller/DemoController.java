package com.saunak.demoservice.controller;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DemoController {

    @Value("${eureka.instance.instance-id}")
    String instance;
    @GetMapping("/hello")
    public String greeting(){
        return "Hello"+instance;
    }
}
