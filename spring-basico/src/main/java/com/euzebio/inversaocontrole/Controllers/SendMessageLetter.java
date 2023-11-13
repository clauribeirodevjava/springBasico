package com.euzebio.inversaocontrole.Controllers;

import com.euzebio.inversaocontrole.Models.User;

public class SendMessageLetter implements SendMessage {

    @Override
    public void sendMessage(User usuario, String message) {
        System.out.printf("Enviando uma cara para %s\nMensagem:\n%s", usuario.getEndereco(), message);
    }
    
}
