package com.michals.designpatterns.abstractfactory.computerfactory.computer;


public class Desktop extends Computer {
    public Desktop() {
        this.setType(ComputerType.DESKTOP);
    }
}
