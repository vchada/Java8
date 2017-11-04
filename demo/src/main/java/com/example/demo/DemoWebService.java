package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoWebService 
{
	 @RequestMapping("/greeting")
	public String greetMessage(@RequestParam(value="name", defaultValue="World") String name)
	{
		return "Hello"+name;
	}
}
