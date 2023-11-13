package com.euzebio.inversaocontrole.Controllers;

import com.euzebio.inversaocontrole.Models.User;

public class SendMessageEmail implements SendMessage {

    @Override
    public void sendMessage(User usuario, String message) {
        System.out.printf("Enviando email para %s\nMensagem:\n%s", usuario.getEmail(), message);
    }
    
}
