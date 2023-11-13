package com.euzebio.springbasico;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("helloEnglish")
@Primary
public class OiIngles implements Oi {

    @Override
    public String oi() {
        return "Hi!";
    }
    
}
