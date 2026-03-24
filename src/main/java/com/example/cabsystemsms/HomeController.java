package com.example.cabsystemsms;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Smart Farming Backend is running successfully";
    }
}