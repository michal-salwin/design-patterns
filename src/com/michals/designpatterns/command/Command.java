package com.michals.designpatterns.command;

public interface Command {
    public void execute();

    public void undo();
}