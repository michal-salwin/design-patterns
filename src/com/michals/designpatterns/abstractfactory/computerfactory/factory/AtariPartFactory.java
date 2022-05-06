package com.michals.designpatterns.abstractfactory.computerfactory.factory;

import com.michals.designpatterns.abstractfactory.computerfactory.computer.ComputerType;
import com.michals.designpatterns.abstractfactory.computerfactory.part.CPUInterface;
import com.michals.designpatterns.abstractfactory.computerfactory.part.GPUInterface;
import com.michals.designpatterns.abstractfactory.computerfactory.part.HDDInterface;
import com.michals.designpatterns.abstractfactory.computerfactory.part.MemoryInterface;
import com.michals.designpatterns.abstractfactory.computerfactory.part.atari.*;

public class AtariPartFactory extends PartFactory {

    public AtariPartFactory(ComputerType type) {
        super(type);
    }

    @Override
    public CPUInterface createCPU() {
        if (computerType == ComputerType.DESKTOP) {
            return new AtariDesktopCPU();
        }
        if (computerType == ComputerType.NOTEBOOK) {
            return new AtariNotebookCPU();
        }
        return null;
    }

    @Override
    public GPUInterface createGPU() {
        return new AtariGPU();
    }

    @Override
    public HDDInterface createHDD() {
        return new AtariHDD();
    }

    @Override
    public MemoryInterface createMemory() {
        return new AtariMemory();
    }
}
