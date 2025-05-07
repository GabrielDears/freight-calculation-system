package com.fiap.estruturais;

public class PaymentService {

    private final PaymentProcessing paymentProcessing;

    public PaymentService(PaymentProcessing paymentProcessing) {
        this.paymentProcessing = paymentProcessing;
    }

    public void process(String account, double amount) {
        // retrieve customer data
        paymentProcessing.processPayment(account, amount);
        // complete processing
    }

}
