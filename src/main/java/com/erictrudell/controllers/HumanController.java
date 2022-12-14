package com.erictrudell.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class HumanController {
	@RequestMapping("/")
	public String standard(){
		return "Hello Human";
	}
	@RequestMapping("/{name}")
	public String name(@PathVariable("name") String name){
		return "Hello %s" + name;
	}
	@RequestMapping("/{name}/{lname}")
	public String name(@PathVariable("name") String name, @PathVariable("lname") String lname){
		return "Hello %s" + name + " " + lname;
	}
//	@RequestMapping("/{name}/{lname}/{times}")
//	public String name(@PathVariable("name") String name, @PathVariable("lname") String lname, @PathVariable("times") Integer times){
//		String fullname = name + lname;
////		String repeatName = StringUtils.repeat(fullname, times);
//		
//		return "Hello %s" + name + " " + lname;
//	}
	
//end		
}
