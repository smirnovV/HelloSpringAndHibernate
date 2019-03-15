package ru.smirnovv.services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String getMessege() {
        return "hello World";
    }
}
