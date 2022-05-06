package com.michals.designpatterns.abstractfactory.computerfactory.store;

import com.michals.designpatterns.abstractfactory.computerfactory.computer.Computer;
import com.michals.designpatterns.abstractfactory.computerfactory.computer.ComputerType;
import com.michals.designpatterns.abstractfactory.computerfactory.factory.ComputerFactory;
import com.michals.designpatterns.abstractfactory.computerfactory.factory.PartFactory;

public abstract class ComputerStore {

    protected PartFactory partFactory;
    protected ComputerFactory computerFactory;

    protected abstract Computer makeComputer(ComputerType type);

    public void test(Computer computer) {
        computer.test();
    }


}
