package com.example.furniture.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testcontroller {
    @GetMapping("/test")
    public String test() {
        return "Hello this is test";
    }
}
