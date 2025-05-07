package com.fiap.estruturais.adapter;

public class ExternalEmailSenderAdapter implements Sender {

    private final ExternalEmailSender externalEmailSender;

    public ExternalEmailSenderAdapter(ExternalEmailSender externalEmailSender) {
        this.externalEmailSender = externalEmailSender;
    }

    @Override
    public void send(String message) {
        externalEmailSender.sendEmail("<EMAIL>", message);
    }
}
