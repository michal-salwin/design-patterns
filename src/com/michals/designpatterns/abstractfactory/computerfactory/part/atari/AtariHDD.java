package com.michals.designpatterns.abstractfactory.computerfactory.part.atari;

import com.michals.designpatterns.abstractfactory.computerfactory.part.HDDInterface;

public class AtariHDD implements HDDInterface {
    @Override
    public String write() {
        return "Atari is writing on disk ...";
    }
}
