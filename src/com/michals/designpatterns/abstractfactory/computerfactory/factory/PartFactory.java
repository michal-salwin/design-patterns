package com.michals.designpatterns.abstractfactory.computerfactory.factory;

import com.michals.designpatterns.abstractfactory.computerfactory.computer.ComputerType;
import com.michals.designpatterns.abstractfactory.computerfactory.part.CPUInterface;
import com.michals.designpatterns.abstractfactory.computerfactory.part.GPUInterface;
import com.michals.designpatterns.abstractfactory.computerfactory.part.HDDInterface;
import com.michals.designpatterns.abstractfactory.computerfactory.part.MemoryInterface;

public abstract class PartFactory {
    ComputerType computerType;
    public PartFactory(ComputerType type) {
        this.computerType = type;
    }
    public abstract CPUInterface createCPU();
    public abstract GPUInterface createGPU();
    public abstract HDDInterface createHDD();
    public abstract MemoryInterface createMemory();

}
