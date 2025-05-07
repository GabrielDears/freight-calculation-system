package com.fiap.estruturais;

public class NuBankPaymentProcessing implements PaymentProcessing {
    @Override
    public void processPayment(String account, double amount) {
        System.out.println("Processing payment from " + account + " for $" + amount + " using NuBank");
    }
}
