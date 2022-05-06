package com.michals.designpatterns.command;

public class FirstCommand implements Command{

    @Override
    public void execute() {
        System.out.println("First command was executed");
    }

    @Override
    public void undo() {
        System.out.println("First command was rolled back");
    }
}
