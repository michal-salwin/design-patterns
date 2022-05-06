package com.michals.designpatterns.abstractfactory.computerfactory.part.apple;

import com.michals.designpatterns.abstractfactory.computerfactory.part.CPUInterface;

public class AppleNotebookCPU implements CPUInterface {

    @Override
    public String Calculate() {
        return "Apple Notebook CPU is calculating ...";
    }
}
