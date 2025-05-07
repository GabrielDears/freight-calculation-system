package com.fiap.estruturais.facade;

public class OrderProcessingFacade {

    private final InventoryService inventoryService;
    private final PaymentService paymentService;
    private final ShippingService shippingService;
    private final NotificationService notificationService;

    public OrderProcessingFacade() {
        this.inventoryService = new InventoryService();
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
        this.notificationService = new NotificationService();
    }

    public void placeOrder(String item, String customerAccount, double amount) {
        if (inventoryService.checkStock(item)) {
            inventoryService.reserveItem(item);
            paymentService.processPayment(customerAccount, amount);
            shippingService.shipItem(item);
            notificationService.notifyCustomer("Your order for " + item + " has been placed successfully!");
        } else {
            notificationService.notifyCustomer("Sorry, " + item + " is out of stock.");
        }
    }
}
