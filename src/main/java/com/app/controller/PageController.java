package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@GetMapping("back")
	public String back(){
		return "backendlogin";
	}
	
	@GetMapping("dev")
	public String dev(){

		System.out.println("ads");
		return "devlogin";
	}
}
