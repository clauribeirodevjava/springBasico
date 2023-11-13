package com.euzebio.springbasico;

import org.springframework.stereotype.Component;

@Component
public class OiIngles implements Oi {

    @Override
    public String oi() {
        return "Hi!";
    }
    
}
