package com.michals.designpatterns.abstractfactory.computerfactory.factory;

import com.michals.designpatterns.abstractfactory.computerfactory.computer.Computer;
import com.michals.designpatterns.abstractfactory.computerfactory.computer.ComputerType;
import com.michals.designpatterns.abstractfactory.computerfactory.computer.Desktop;
import com.michals.designpatterns.abstractfactory.computerfactory.computer.Notebook;
import com.michals.designpatterns.abstractfactory.computerfactory.part.CPUInterface;
import com.michals.designpatterns.abstractfactory.computerfactory.part.GPUInterface;
import com.michals.designpatterns.abstractfactory.computerfactory.part.HDDInterface;
import com.michals.designpatterns.abstractfactory.computerfactory.part.MemoryInterface;

public class ComputerFactory {
    ComputerType computerType;
    public ComputerFactory(ComputerType type) {
        this.computerType = type;
    }
    public Computer create() {
        if (computerType == ComputerType.DESKTOP) {
            return new Desktop();
        };

        if (computerType == ComputerType.NOTEBOOK) {
            return new Notebook();
        };
        return null;
    }


}
