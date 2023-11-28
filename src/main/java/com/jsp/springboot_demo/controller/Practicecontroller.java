package com.jsp.springboot_demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController// to tell ioc that in this particular class that we are going to create the restAPI's
public class Practicecontroller {
	
	@RequestMapping("/print")
	public static void print() {
		System.out.println("print api is called");
	}
	
	@RequestMapping("/display")
	public String display() {
		return "display api is called";
	}

}
