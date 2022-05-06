package com.michals.designpatterns.observable;

public class Observer3 implements Observer{

    public Observer3(Observable observable) {
        observable.registerObserver(this);
    }

    @Override
    public void update(int number) {
        System.out.println("com.michals.designpatterns.observable.Observer3 is updated with " + number);
    }}
