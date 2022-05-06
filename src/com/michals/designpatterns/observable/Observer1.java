package com.michals.designpatterns.observable;

public class Observer1 implements Observer{


    public Observer1(Observable observable) {
        observable.registerObserver(this);
    }
    @Override
    public void update(int number) {
        System.out.println("com.michals.designpatterns.observable.Observer1 is updated with " + number);
    }
}
