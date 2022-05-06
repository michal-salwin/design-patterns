package com.michals.designpatterns.command;

public class ThirdCommand implements Command{

    @Override
    public void execute() {
        System.out.println("Third command was executed");
    }

    @Override
    public void undo() {
        System.out.println("Third command was rolled back");
    }
}
