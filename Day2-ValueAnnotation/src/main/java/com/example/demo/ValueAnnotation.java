package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueAnnotation
{
	@Value("${pname}")
	public String pname;
	@GetMapping("/Value")
	public String Print()
	{
		return "I Love "+pname;
	}
}
