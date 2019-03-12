package ru.smirnovv;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloSpringController {
    @GetMapping
    public String spring() {
        return "Hello Spring";
    }
}
