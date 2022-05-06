package com.michals.designpatterns.abstractfactory.computerfactory;


import com.michals.designpatterns.abstractfactory.computerfactory.computer.Computer;
import com.michals.designpatterns.abstractfactory.computerfactory.computer.ComputerType;
import com.michals.designpatterns.abstractfactory.computerfactory.store.AppleComputerStore;
import com.michals.designpatterns.abstractfactory.computerfactory.store.AtariComputerStore;

public class Main {
    public static void main(String[] args){
        AppleComputerStore appleStore = new AppleComputerStore();
        Computer apple = appleStore.makeComputer(ComputerType.DESKTOP);
        apple.turnOn();
        apple.test();

        AtariComputerStore atariStore = new AtariComputerStore();
        Computer computer = atariStore.makeComputer(ComputerType.NOTEBOOK);
        computer.turnOn();
        computer.test();
    }

}
