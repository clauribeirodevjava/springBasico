package com.euzebio.inversaocontrole.Controllers;

import com.euzebio.inversaocontrole.Models.User;

public interface SendMessage {
    public void sendMessage(User usuario, String message);
}
