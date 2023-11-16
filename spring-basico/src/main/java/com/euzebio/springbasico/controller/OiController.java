package com.euzebio.springbasico.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.euzebio.springbasico.Oi;

@RestController
@RequestMapping("/oi")
public class OiController {

	private final Oi helloOne;
	private final Oi helloTwo;
	private final Oi helloThree;

	public OiController(
			@Qualifier("helloPortuguese") Oi helloOne,
			@Qualifier("helloEnglish") Oi helloTwo,
			@Qualifier("helloEspanhol") Oi helloThree) {
		this.helloOne = helloOne;
		this.helloTwo = helloTwo;
		this.helloThree = helloThree;
	}

	@GetMapping("/cumprimentar")
	@ResponseBody
	public String cumprimentar() {
		StringBuilder result = new StringBuilder();
		result.append(helloOne.oi()).append("<br>");
		result.append(helloTwo.oi()).append("<br>");
		result.append(helloThree.oi()).append("<br>");
		return result.toString();
	}
}
