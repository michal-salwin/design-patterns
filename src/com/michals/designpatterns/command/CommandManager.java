package com.michals.designpatterns.command;
import java.util.Stack;

public class CommandManager {
    private Stack<Command> history = new Stack<>();

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }

    public void execute(Command command) {
        command.execute();
        push(command);
    }

    public void undo() {
        if (isCommandStackEmpty()) {
            return;
        }
        Command command = pop();
        command.undo();
    }

    private boolean isCommandStackEmpty() { return history.isEmpty(); }
}