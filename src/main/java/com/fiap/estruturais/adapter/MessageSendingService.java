package com.fiap.estruturais.adapter;

public class MessageSendingService {

    public void sendMessage(String message, Sender sender) {
        sender.send(message);
    }

}
