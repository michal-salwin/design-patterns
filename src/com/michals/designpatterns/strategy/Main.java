package com.michals.designpatterns.strategy;

import com.michals.designpatterns.decorator.BlackCoffee;
import com.michals.designpatterns.decorator.Coffee;
import com.michals.designpatterns.decorator.IceCreamDecorator;
import com.michals.designpatterns.decorator.MilkDecorator;

public class Main {
    public static void main(String[] args){
        Order pen = new Order("Pen");
        Order pencil = new Order("Pencil");

        pen.pay(new PayByPayPal(),10);
        pencil.pay(new PayByMastercard(),12);

    }

}
