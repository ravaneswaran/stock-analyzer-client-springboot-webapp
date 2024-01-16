package com.stock.analyzer.controller.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldDemoController {

    @GetMapping("/helloworld")
    public String index(){
        return "Hello World !!!";
    }
}
