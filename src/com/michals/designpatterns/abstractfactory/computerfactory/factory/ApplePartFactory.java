package com.michals.designpatterns.abstractfactory.computerfactory.factory;

import com.michals.designpatterns.abstractfactory.computerfactory.computer.ComputerType;
import com.michals.designpatterns.abstractfactory.computerfactory.part.CPUInterface;
import com.michals.designpatterns.abstractfactory.computerfactory.part.GPUInterface;
import com.michals.designpatterns.abstractfactory.computerfactory.part.HDDInterface;
import com.michals.designpatterns.abstractfactory.computerfactory.part.MemoryInterface;
import com.michals.designpatterns.abstractfactory.computerfactory.part.apple.*;
import com.michals.designpatterns.abstractfactory.computerfactory.part.atari.AtariDesktopCPU;
import com.michals.designpatterns.abstractfactory.computerfactory.part.atari.AtariNotebookCPU;


public class ApplePartFactory extends PartFactory {

    public ApplePartFactory(ComputerType type) {
        super(type);
    }

    @Override
    public CPUInterface createCPU() {
        if (computerType == ComputerType.DESKTOP) {
            return new AppleDesktopCPU();
        }
        if (computerType == ComputerType.NOTEBOOK) {
            return new AppleNotebookCPU();
        }
        return null;
    }
    @Override
    public GPUInterface createGPU() {
        return new AppleGPU();
    }

    @Override
    public HDDInterface createHDD() {
        return new AppleHDD();
    }

    @Override
    public MemoryInterface createMemory() {
        return new AppleMemory();
    }
}
