package com.euzebio.inversaocontrole;

import com.euzebio.inversaocontrole.Controllers.SendMessage;
import com.euzebio.inversaocontrole.Controllers.SendMessageLetter;
import com.euzebio.inversaocontrole.Models.User;

public class SendMessageApplication {
    public static void main(String[] args) {
        User usuario = new User("João", "da Silva", "99999999999", "joaosilva@email.com", "Rua dos bobos, nº 0");
        SendMessage sender = new SendMessageLetter();

        sender.sendMessage(usuario, "Bem vindo a trilha de Java");
    }
}
