package com.michals.designpatterns.abstractfactory.computerfactory.part.apple;

import com.michals.designpatterns.abstractfactory.computerfactory.part.GPUInterface;

public class AppleGPU implements GPUInterface {

    @Override
    public String print() {
        return "Apple GPU is printing on screen ...";
    }
}
