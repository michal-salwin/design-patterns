package com.michals.designpatterns.strategy;

public class PayByPayPal implements PayStrategy{

    @Override
    public void pay(int paymentAmount) {
        System.out.println(paymentAmount + " was paid by PayPal");
    }
}
