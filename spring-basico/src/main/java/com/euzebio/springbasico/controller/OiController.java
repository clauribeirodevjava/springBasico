package com.euzebio.springbasico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.euzebio.springbasico.Oi;

@RestController
@RequestMapping("/oi")
public class OiController {
    
    @Autowired
    @Qualifier("helloPortuguese")
    Oi helloOne;
    
    @Autowired
    @Qualifier("helloEnglish")
    Oi helloTwo;
    
    @Autowired
    @Qualifier("helloEspanhol")
    Oi helloThree;

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
