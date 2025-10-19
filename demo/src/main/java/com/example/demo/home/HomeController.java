package com.example.demo.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    @RequestMapping(value = "/home")
    public String home() {
        System.out.println("home Check");
        System.out.println("Trivy 테스트8");
        return "Welcome home";
    }
}
