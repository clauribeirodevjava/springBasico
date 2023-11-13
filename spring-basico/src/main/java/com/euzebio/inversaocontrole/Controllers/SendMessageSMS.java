package com.euzebio.inversaocontrole.Controllers;

import com.euzebio.inversaocontrole.Models.User;

public class SendMessageSMS implements SendMessage {

    @Override
    public void sendMessage(User usuario, String message) {
        System.out.printf("Enviando SMS para o número %s\nMensagem:\n%s", usuario.getTelefone(), message);
    }
    
}
