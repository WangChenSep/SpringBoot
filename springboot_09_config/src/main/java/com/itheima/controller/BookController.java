package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Rest模式
@RestController
@RequestMapping(value = "/books")
public class BookController {

    @GetMapping
    public String getById(){
        System.out.println("springboot is running...");
        System.out.println("springboot is running...222");
        return "springboot is running";
    }

}
