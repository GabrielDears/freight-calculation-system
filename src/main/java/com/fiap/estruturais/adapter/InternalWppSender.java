package com.fiap.estruturais.adapter;

public class InternalWppSender implements Sender {
    @Override
    public void send(String message) {
        System.out.println( "Sending WPP message: " + message);
    }
}
