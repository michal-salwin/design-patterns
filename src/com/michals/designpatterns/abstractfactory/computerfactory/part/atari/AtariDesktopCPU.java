package com.michals.designpatterns.abstractfactory.computerfactory.part.atari;

import com.michals.designpatterns.abstractfactory.computerfactory.part.CPUInterface;

public class AtariDesktopCPU implements CPUInterface {

    @Override
    public String Calculate() {
        return "Atari Desktop CPU is calculating ...";
    }
}
