package com.michals.designpatterns.abstractfactory.computerfactory.part.apple;

import com.michals.designpatterns.abstractfactory.computerfactory.part.MemoryInterface;

public class AppleMemory implements MemoryInterface {
    @Override
    public String write() {
        return "Apple is writing data into memory ...";
    }
}
