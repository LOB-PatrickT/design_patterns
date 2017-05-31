package com.remote.impl;

import com.remote.Command;

/**
 * Created by Patrick on 4/29/2017.
 */
public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("no command executed");
    }

    @Override
    public void undo() {
        System.out.println("no command undone");
    }

}
