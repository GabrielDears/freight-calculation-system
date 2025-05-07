package com.fiap.comportamentais.strategy;

public class StrategyMain {

    public static void main(String[] args) {
        CheckoutService checkoutService = new CheckoutService();

        checkoutService.setPaymentStrategy(new CreditCardPayment());
        checkoutService.processOrder(100);

        checkoutService.setPaymentStrategy(new PayPalPayment());
        checkoutService.processOrder(100);

        checkoutService.setPaymentStrategy(new CryptoPayment());
        checkoutService.processOrder(100);
    }

}
