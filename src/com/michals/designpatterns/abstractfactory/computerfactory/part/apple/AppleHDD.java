package com.michals.designpatterns.abstractfactory.computerfactory.part.apple;

import com.michals.designpatterns.abstractfactory.computerfactory.part.HDDInterface;

public class AppleHDD implements HDDInterface {
    @Override
    public String write() {
        return "Apple is writing on disk ...";
    }
}
