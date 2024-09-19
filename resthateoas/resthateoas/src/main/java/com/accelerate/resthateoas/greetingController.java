package com.accelerate.resthateoas;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greetingController {

    private static final String TEMPLATE="Hello, %s!";

    @RequestMapping("/greeting")
    public HttpEntity<Greeting> greeting (
                @RequestParam(value="name",defaultValue = "World") String name){

            Greeting greeting=new Greeting(String.format(TEMPLATE, name));
            greeting.add(linkTo(methodOn(greetingController.class).greeting(name)).withSelfRel());

            return new ResponseEntity<>(greeting , HttpStatus.OK);

        }
    }

