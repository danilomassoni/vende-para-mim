package com.danilomassoni.backendvendeparamim.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class hello {
    
    @GetMapping("/")
    public String hello() {
        return "Olá!" + new Date();
    }
    
}
