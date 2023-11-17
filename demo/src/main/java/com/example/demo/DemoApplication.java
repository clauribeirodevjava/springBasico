package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.domain.Oi;
import com.example.demo.impl.OiPortugues;

@SpringBootApplication
public class DemoApplication {
	Oi oi;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner initOi() {
		return args -> {

			System.out.println(oi.oi());

		};
	}

}
