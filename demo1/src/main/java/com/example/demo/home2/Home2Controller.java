package com.example.demo.home2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home2")
public class Home2Controller {
    @GetMapping
    public String home2(){
        System.out.println("home2");
        return "home2";
    }
}
