package com.michals.designpatterns.strategy;

public class PayByMastercard implements PayStrategy{

    @Override
    public void pay(int paymentAmount) {

        System.out.println(paymentAmount + " was paid by Mastercard");
    }
}
