package com.fiap.estruturais.facade;

public class FacadeMain {

    public static void main(String[] args) {
        OrderProcessingFacade orderFacade = new OrderProcessingFacade();
        orderFacade.placeOrder("Laptop", "acc123", 1500.00);
    }

}
