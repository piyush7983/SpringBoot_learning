package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/")
    public String hello(){
        return "this is my first line" ;
    }

    @GetMapping("/profile")
    public String pro(){
        return "tanmay is my son" ;
    }

    @GetMapping("/profile/name")
    public String name(){
        return "hello mittar" ;
    }
}
