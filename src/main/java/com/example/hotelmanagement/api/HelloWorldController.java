package com.example.hotelmanagement.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1") // Base path for all mappings in this controller
public class HelloWorldController {

    @GetMapping("/hello-world")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello World!");
    }
}