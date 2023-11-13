package com.euzebio.springbasico;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBasicoApplication {
	@Autowired
	@Qualifier("helloPortuguese")
	Oi helloOne;
	@Autowired
	@Qualifier("helloEnglish")
	Oi helloTwo;
	@Autowired
	@Qualifier("helloEspanhol")
	Oi helloThree;
	public static void main(String[] args) {
		SpringApplication.run(SpringBasicoApplication.class, args);

	}

	@Bean
	CommandLineRunner initOi(){
		return args -> {
			System.out.println(helloOne.oi());
			System.out.println(helloTwo.oi());
			System.out.println(helloThree.oi());
		};
	}

}