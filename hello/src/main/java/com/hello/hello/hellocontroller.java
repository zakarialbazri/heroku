package com.hello.hello;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
public class hellocontroller {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello zakaria";
    }
}
