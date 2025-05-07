package com.fiap.comportamentais.strategy;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println( "Paying with PayPal");
    }
}
