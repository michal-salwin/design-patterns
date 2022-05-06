package com.michals.designpatterns.observable;

public class Observer2 implements Observer{


    public Observer2(Observable observable) {
        observable.registerObserver(this);
    }
    @Override
    public void update(int number) {
        System.out.println("com.michals.designpatterns.observable.Observer2 is updated with " + number);
    }
}
