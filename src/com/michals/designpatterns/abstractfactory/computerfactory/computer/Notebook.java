package com.michals.designpatterns.abstractfactory.computerfactory.computer;


public class Notebook extends Computer {

    public Notebook() {
        this.setType(ComputerType.NOTEBOOK);
    }
}
