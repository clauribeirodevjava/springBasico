package com.euzebio.springbasico;

import org.springframework.stereotype.Component;

@Component("helloEspanhol")
public class OiEspanhol implements Oi{

    @Override
    public String oi() {
        return "Ey!";
    }
    
}
