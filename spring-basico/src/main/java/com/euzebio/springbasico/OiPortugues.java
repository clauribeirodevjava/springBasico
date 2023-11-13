package com.euzebio.springbasico;

import org.springframework.stereotype.Component;

@Component("helloPortuguese")
public class OiPortugues implements Oi{

    @Override
    public String oi() {
        return "Oi!";
    }
    
}
