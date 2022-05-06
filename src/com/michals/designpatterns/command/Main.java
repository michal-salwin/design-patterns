package com.michals.designpatterns.command;


public class Main {
    public static void main(String[] args){
        FirstCommand c1 = new FirstCommand();
        SecondCommand c2 = new SecondCommand();
        ThirdCommand  c3 = new ThirdCommand();

        CommandManager cm = new CommandManager();

        cm.execute(c1);
        cm.execute(c2);
        cm.undo();
        cm.execute(c3);
        cm.undo();

    }

}
