package com.michals.designpatterns.abstractfactory.computerfactory.part.apple;

import com.michals.designpatterns.abstractfactory.computerfactory.part.CPUInterface;

public class AppleDesktopCPU implements CPUInterface {

    @Override
    public String Calculate() {
        return "Apple Desktop CPU is calculating ...";
    }
}
