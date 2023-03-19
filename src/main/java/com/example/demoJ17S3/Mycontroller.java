package com.example.demoJ17S3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {
    @GetMapping("/")
    public String mymeth() {
        return "hi world";
    }
}
