package com.remote.impl;

import com.remote.Command;
import com.remote.client.GarageDoor;

/**
 * Created by Patrick on 4/25/2017.
 */
public class GarageDoorCloseCommand implements Command {
    GarageDoor garageDoor;
    
    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.close();
    }

    @Override
    public void undo() {
        garageDoor.open();
    }
}
