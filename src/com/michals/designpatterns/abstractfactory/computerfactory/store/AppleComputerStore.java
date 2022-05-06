package com.michals.designpatterns.abstractfactory.computerfactory.store;

import com.michals.designpatterns.abstractfactory.computerfactory.computer.Computer;
import com.michals.designpatterns.abstractfactory.computerfactory.computer.ComputerType;
import com.michals.designpatterns.abstractfactory.computerfactory.factory.ApplePartFactory;
import com.michals.designpatterns.abstractfactory.computerfactory.factory.ComputerFactory;

public class AppleComputerStore extends ComputerStore{

    @Override
    public Computer makeComputer(ComputerType type) {
        ApplePartFactory partFactory = new ApplePartFactory(type);
        ComputerFactory computerFactory = new ComputerFactory(type);

        Computer computer = computerFactory.create();

        computer.setName("Apple");
        computer.setCpu(partFactory.createCPU());
        computer.setGpu(partFactory.createGPU());
        computer.setHdd(partFactory.createHDD());
        computer.setMemory(partFactory.createMemory());

        return computer;

    }
}
