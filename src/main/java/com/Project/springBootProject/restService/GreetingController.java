package com.Project.springBootProject.restService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")    // MAPS THE ENDPOINT
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){    //Binds the value of the query string parameter name into the name parameter
        return new Greeting(counter.incrementAndGet(), String.format(template, name));              // of the method
    }
}
