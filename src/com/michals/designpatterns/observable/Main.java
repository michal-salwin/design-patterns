package com.michals.designpatterns.observable;

public class Main {
    public static void main(String[] args){
        Observable observable = new Observable1();
        Observer1 observer1 = new Observer1(observable);
        Observer2 observer2 = new Observer2(observable);
        Observer3 observer3 = new Observer3(observable);
        observable.setNumber(1);
        observable.setNumber(2);


    }

}
