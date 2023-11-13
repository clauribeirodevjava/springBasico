package com.euzebio.springbasico;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBasicoApplication {
	@Autowired
	Oi oiPortugues;
	@Autowired
	Oi oiIngles;
	@Autowired
	Oi oiEspanhol;
	public static void main(String[] args) {
		SpringApplication.run(SpringBasicoApplication.class, args);

	}

	@Bean
	CommandLineRunner initOi(){
		return args -> {
			System.out.println(oiPortugues.oi());
			System.out.println(oiIngles.oi());
			System.out.println(oiEspanhol.oi());
		};
	}

}