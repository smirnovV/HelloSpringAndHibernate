package ru.smirnovv.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.smirnovv.services.HelloService;

@RestController
@RequestMapping("/")
public class HelloController {

    private final HelloService helloService;

    @Autowired
    public HelloController(final HelloService helloService) {
        Assert.notNull(helloService, "Argument 'helloService' can not be null");
        this.helloService = helloService;
    }

    @GetMapping
    public String spring() {
        return helloService.getMessege();
    }
}
