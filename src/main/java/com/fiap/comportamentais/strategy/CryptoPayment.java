package com.fiap.comportamentais.strategy;

public class CryptoPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println( "Paying with crypto");
    }
}
