package com.michals.designpatterns.decorator;

public class BlackCoffee implements Coffee{

    @Override
    public double getPrice() {
        return 10;
    }

    @Override
    public String getName() {
        return "Black Coffee";
    }
}
