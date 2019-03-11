package ru.smirnovv.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloSpringController {
    @GetMapping(value = "/index")
    public String spring() {
        return "Hello Spring";
    }
}
