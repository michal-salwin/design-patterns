package com.michals.designpatterns.command;

public class SecondCommand implements Command{

    @Override
    public void execute() {
        System.out.println("Second command was executed");
    }

    @Override
    public void undo() {
        System.out.println("Second command was rolled back");
    }
}
