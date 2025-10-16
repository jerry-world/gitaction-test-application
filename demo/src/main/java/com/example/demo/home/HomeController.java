package com.example.demo.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1/home")
public class HomeController {

    @GetMapping
    public String home() {
        System.out.println("home#3");
        return "Hello World2";
    }
}
