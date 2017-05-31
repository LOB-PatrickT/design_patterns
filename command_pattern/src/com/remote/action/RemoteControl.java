package com.remote.action;

import com.remote.Command;
import com.remote.MacroCommand;
import com.remote.impl.NoCommand;

/**
 * Created by Patrick on 4/24/2017.
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for(int i = 0; i < onCommands.length; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void pressOnButton(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void pressOffButton(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButton() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();

        System.out.println("----- Remote Control buttons-----");

        for(int i = 0; i < onCommands.length; i++) {
            sb.append("[Slot " + i + "]" + onCommands[i].getClass().getName() + "   "
                    + offCommands[i].getClass().getName() + "\n");
        }

        sb.append("[Undo] " + undoCommand.getClass().getName());
        return sb.toString();
    }
}
