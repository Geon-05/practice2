package com.example.practice2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class indexController {
    @GetMapping("/")
    public String getMethodName() {
        return "/index";
    }
    
}
