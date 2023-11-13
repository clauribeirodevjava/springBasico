package com.euzebio.springbasico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBasicoApplication {
	@Autowired
	List<Oi> ois;
	public static void main(String[] args) {
		SpringApplication.run(SpringBasicoApplication.class, args);

	}

	@Bean
	CommandLineRunner initOi(){
		return args -> {
			ois.forEach(oi ->  {
				System.out.println(oi.oi());
			});
		};
	}

}