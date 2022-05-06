package com.michals.designpatterns.decorator;

public class Main {
    public static void main(String[] args){
        Coffee blackCoffee = new BlackCoffee();
        Coffee blackCoffeeWithMilk = new MilkDecorator(blackCoffee);
        System.out.println(blackCoffee.getName() + ": " + blackCoffee.getPrice());
        System.out.println(blackCoffeeWithMilk.getName()+ ": " + blackCoffeeWithMilk.getPrice());

        Coffee blackCoffeeWithMilkAndIceCream = new IceCreamDecorator(new MilkDecorator(new BlackCoffee()));
        System.out.println(blackCoffeeWithMilkAndIceCream.getName()+": "+ blackCoffeeWithMilkAndIceCream.getPrice());


    }

}
