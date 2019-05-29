package com.qingguatang.java5minute.course1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//注释类
@RestController
public class HelloWorld {
    @RequestMapping(value = "/")
    public String hello() {
        String message = "hello world";
        return message;
    }
}
