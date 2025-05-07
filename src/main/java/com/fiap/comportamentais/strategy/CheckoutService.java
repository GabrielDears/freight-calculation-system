package com.fiap.comportamentais.strategy;

public class CheckoutService {

    private PaymentStrategy paymentStrategy;

    void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    void processOrder(double amount) {
        paymentStrategy.pay(amount);
    }

}
