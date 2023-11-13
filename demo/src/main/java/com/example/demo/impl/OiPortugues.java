package com.example.demo.impl;

import org.springframework.stereotype.Component;

import com.example.demo.domain.Oi;

@Component
public class OiPortugues implements Oi {

	@Override
	public String oi() {

		return "Oi!!";
	}

}
