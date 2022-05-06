package com.michals.designpatterns.decorator;

public class IceCreamDecorator implements Coffee{

    private Coffee coffee;

    IceCreamDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getPrice() {
        return this.coffee.getPrice() + 3.5;
    }

    @Override
    public String getName() {
        return this.coffee.getName() + " with ice cream" ;
    }
}
