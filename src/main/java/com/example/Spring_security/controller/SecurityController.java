package com.example.Spring_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/authorize")
    public String greeting(){
        return "Привет лунатикам!";
    }
}
