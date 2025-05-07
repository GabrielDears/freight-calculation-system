package com.fiap.estruturais.facade;

public class PaymentService {
    public void processPayment(String account, double amount) {
        System.out.println("Processing payment from " + account + " for $" + amount);
    }
}
