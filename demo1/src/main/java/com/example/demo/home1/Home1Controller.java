package com.example.demo.home1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home1")
public class Home1Controller {
    @GetMapping
    public String home1(){
        System.out.println("home1_11");
        return "home1";
    }
}
