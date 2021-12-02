package com.example.Spring_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/authorize")
    public String lunohodFirste() {
        return "Я луноход 1, вызываю луноход 2!";
    }

    @GetMapping("/authorize2")
    public String lunohodSecond() {
        return "Я луноход 2, вызываю луноход 1! Мне пришлось аутентифицироваться";
    }


}
