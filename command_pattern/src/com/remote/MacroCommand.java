package com.remote;

import javax.crypto.Mac;

/**
 * Created by Patrick on 5/3/2017.
 */
public class MacroCommand implements Command{
    Command commands[] = null;

    public MacroCommand(Command commands[]) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for(Command command: commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for(Command command: commands) {
            command.undo();
        }
    }
}
