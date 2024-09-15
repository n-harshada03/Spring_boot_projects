package com.accelerate.quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


//
@SpringBootApplication
@RestController   //tells Spring that this code describes endpoint that should be made available over the web.
public class QuickstartApplication {

	public static void main(String[] args) {

		SpringApplication.run(QuickstartApplication.class, args);
	}

	@GetMapping("/hello")  // tells Spring that use hello() method to answer requests
	public String hello(@RequestParam(value = "name",defaultValue = "World") String name){
		return String.format("Hello %s!",name );

    }

}

//  Spring Boot’s embedded Apache Tomcat server is acting as a webserver and is listening for
//  requests on localhost port 8080. Open your browser and in the address bar at the top
//  enter http://localhost:8080/hello