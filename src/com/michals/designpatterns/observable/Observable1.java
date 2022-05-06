package com.michals.designpatterns.observable;

import java.util.ArrayList;

public class Observable1 implements Observable{

    int number;
    private ArrayList observerList;

    public Observable1() {
        this.observerList = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    public void setNumber(int number) {
        this.number = number;
        updateObservers();
    }
    @Override
    public void updateObservers() {
        for (int i=0; i<observerList.size(); i++) {
            Observer Obs = (Observer) observerList.get(i);
            Obs.update(this.number);
        }
    }
}
