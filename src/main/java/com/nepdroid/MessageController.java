package com.nepdroid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	Integer a=10, b=5;
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}
	
	@GetMapping("/add")
	public Integer addition() {
		return (a+b) ;
	}
	
	@GetMapping("/sub")
	public Integer subtraction() {
		return (a-b) ;
	}
	
	@GetMapping("/mul")
	public Integer multiplication() {
		return (a*b) ;
	}
	
	@GetMapping("/div")
	public Integer division() {
		return (a/b) ;
	}

}







