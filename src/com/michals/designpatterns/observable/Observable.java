package com.michals.designpatterns.observable;

public interface Observable {
    void registerObserver(Observer o);
    void updateObservers();

    void setNumber(int i);
}
