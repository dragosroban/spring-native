package com.springnative.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestNative {

    @GetMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "hello";
    }
    
    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "This is the homepage";
    }

}
