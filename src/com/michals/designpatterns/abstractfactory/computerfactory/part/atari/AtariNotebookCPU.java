package com.michals.designpatterns.abstractfactory.computerfactory.part.atari;

import com.michals.designpatterns.abstractfactory.computerfactory.part.CPUInterface;

public class AtariNotebookCPU implements CPUInterface {

    @Override
    public String Calculate() {
        return "Atari Notebook CPU is calculating ...";
    }
}
