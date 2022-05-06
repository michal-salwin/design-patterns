package com.michals.designpatterns.decorator;

public class MilkDecorator implements Coffee{

    private Coffee coffee;

    MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getPrice() {
        return this.coffee.getPrice() + 1;
    }

    @Override
    public String getName() {
        return this.coffee.getName() + " with milk" ;
    }
}
