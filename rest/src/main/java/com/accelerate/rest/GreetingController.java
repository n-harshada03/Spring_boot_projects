package com.accelerate.rest;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

//HTTP GET requests are handled by rest controller
// restcontroller handles GET requests for "/greeting" by returning a new instance of the "Greeting" class:

@RestController
public class GreetingController {
    private static final String template ="Hello, %s!";
    private final AtomicLong counter =new AtomicLong();


    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World")String name){
        return new Greeting(counter.incrementAndGet(),String.format(template,name));

    }

}

//extra :
//The @GetMapping annotation ensures that HTTP GET
// requests to /greeting are mapped to the greeting() method.
// there are same for POST-@PostMapping ,