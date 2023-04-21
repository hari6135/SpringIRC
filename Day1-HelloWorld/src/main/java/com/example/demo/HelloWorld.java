package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

//annotation
@Controller
public class HelloWorld
{
	@ResponseStatus
	@RequestMapping("/")
	public String display()
	{
		return "Hello World";
	}
}