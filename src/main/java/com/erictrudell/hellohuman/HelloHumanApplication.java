package com.erictrudell.hellohuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class HelloHumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloHumanApplication.class, args);
	}
	@RequestMapping("/")
	public String standard(){
		return "Hello Human";
	}
	@RequestMapping("/{name}")
	public String name(@PathVariable("name") String name){
		return "Hello " + name;
	}
	@RequestMapping("/{name}/{lname}")
	public String name(@PathVariable("name") String name, @PathVariable("lname") String lname){
		return "Hello " + name + " " + lname;
	}

}
