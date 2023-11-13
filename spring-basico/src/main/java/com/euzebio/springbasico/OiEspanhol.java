package com.euzebio.springbasico;

import org.springframework.stereotype.Component;

@Component
public class OiEspanhol implements Oi{

    @Override
    public String oi() {
        return "Ey!";
    }
    
}
