package com.example.demo.home2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home2")
public class Home2Controller {
    @GetMapping
    String get() {
        System.out.println("home2 Check");
        return "Welcome home2";
    }
}
