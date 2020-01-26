package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
@SpringBootApplication
public class HelloAnthemApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloAnthemApplication.class, args);
		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHelloAnthem());
	}

}
