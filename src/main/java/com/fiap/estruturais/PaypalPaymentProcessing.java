package com.fiap.estruturais;

public class PaypalPaymentProcessing implements PaymentProcessing {
    @Override
    public void processPayment(String account, double amount) {
        System.out.println("Processing payment from " + account + " for $" + amount + " using Paypal");
    }
}
