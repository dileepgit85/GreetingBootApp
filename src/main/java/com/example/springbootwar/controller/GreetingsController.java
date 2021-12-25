package com.example.springbootwar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping("/greetings")
    public String sayGreetings() {
        return "Hello Spring Boot!!!";
    }
}
