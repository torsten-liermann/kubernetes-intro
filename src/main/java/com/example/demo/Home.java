package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @GetMapping("/")
    public String home() {
        return "TAMARA, Hello World!! - Biergarten, weil die Sonne wieder da ist, mal ist sie wieder weg";
    }
}