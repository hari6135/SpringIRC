package com.example.demo.Welcome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome 
{
	public String pname="Hariharan";
	@GetMapping("/Welcome")
	public String Welcome()
	{
		return "Welcome to REST API"+pname;
	}
	
}
