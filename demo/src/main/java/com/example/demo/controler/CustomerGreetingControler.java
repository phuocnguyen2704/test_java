package com.example.demo.controler;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
// @RequestMapping("path")
public String requestMethodName(@RequestParam String param) {
    return new String();
}

public class CustomerGreetingControler {
    
}
