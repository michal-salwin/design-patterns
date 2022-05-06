package com.michals.designpatterns.abstractfactory.computerfactory.part.atari;

import com.michals.designpatterns.abstractfactory.computerfactory.part.MemoryInterface;

public class AtariMemory implements MemoryInterface {
    @Override
    public String write() {
        return "Atari is writing data into memory ...";
    }
}
