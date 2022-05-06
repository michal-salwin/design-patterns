package com.michals.designpatterns.strategy;

public class Order {

    String productName;

    public Order(String productName) {
        this.productName = productName;
    }

    public void pay(PayStrategy paymentMethod, int amount) {
        System.out.println("Paying for " + this.productName);
        paymentMethod.pay(amount);
    }
}
