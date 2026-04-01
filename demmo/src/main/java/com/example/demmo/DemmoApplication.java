package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemmoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemmoApplication.class, args);
    }

    // --- Student Greeting Logic ---
    @GetMapping("/greet")
    public String sayHello() {
        return "Hello Student! Welcome to your Jenkins-built application.";
    }

    // --- Login Validator Logic ---
    @GetMapping("/login")
    public String checkLogin(@RequestParam String user, @RequestParam String pass) {
        // Simple validation logic
        if ("admin".equals(user) && "password123".equals(pass)) {
            return "SUCCESS: Login valid for " + user;
        } else {
            return "FAILURE: Invalid username or password.";
        }
    }
}