package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayhello() {
		return "<h1 style='color:red'> Hello guys welcome to spring boot </h1>";
	}
	
	@RequestMapping("/howareyou")
	public String how() {
		return "<h2> I'm Good Thank You, How are you </h2>";
	}

	@RequestMapping("/Mobiles")
	
	public List<Mobile> getMobiles(){
		return Arrays.asList(
				new Mobile(1,"98T","OnePluse",42000),
				new Mobile(2,"Pixel 7 Pro","Google",72000),
				new Mobile(3,"S23","Samsung",12000)
				);
	}
	

}
