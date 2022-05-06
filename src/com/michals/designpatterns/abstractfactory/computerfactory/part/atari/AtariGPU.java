package com.michals.designpatterns.abstractfactory.computerfactory.part.atari;

import com.michals.designpatterns.abstractfactory.computerfactory.part.GPUInterface;

public class AtariGPU implements GPUInterface {

    @Override
    public String print() {
        return "Atari GPU is printing on screen ...";
    }
}
