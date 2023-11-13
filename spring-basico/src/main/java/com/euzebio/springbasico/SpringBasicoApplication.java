package com.euzebio.springbasico;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBasicoApplication {
	Oi oi = new OiEspanhol();
	public static void main(String[] args) {
		SpringApplication.run(SpringBasicoApplication.class, args);

	}

	@Bean
	CommandLineRunner initOi(){
		return args -> {
			System.out.println(oi.oi());
		};
	}

}