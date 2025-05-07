package com.fiap.comportamentais.strategy;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println( "Paying with credit card");
    }
}
