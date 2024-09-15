package com.accelerate.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class RestApplication {


	public static void main(String[] args) {

		SpringApplication.run(RestApplication.class, args);
	}


}

//SpringBootApplication adds all :@Configuration, @EnableAutoConfiguration,@ComponentScan
//main() method uses SpringApplication.run()
// method automatically sets up the application, launches it, and configures everything you need
// (like an embedded Tomcat server, if you're building a web app),