package com.example.games;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition
(
		info =@Info(
			title = "Game Store",
				version = "2.0",
			description = "Game Hub Project",
			contact = @Contact(
					name = "Hari",
					email = "hariabi6135@gmail.com"
				)
				)
		)
public class OneToManyApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneToManyApplication.class, args);
	}

}
