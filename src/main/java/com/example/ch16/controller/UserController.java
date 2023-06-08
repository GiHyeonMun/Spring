package com.example.ch16.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping()
    public String getTest() {
        return "Get Test";
    }

    @PostMapping("/admin")
    public String adminTest() {
        return "Admin Test";
    }
}
