package com.example.simple_java_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }
}
