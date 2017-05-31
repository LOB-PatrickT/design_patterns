package com.remote.impl;

import com.remote.Command;
import com.remote.client.GarageDoor;

/**
 * Created by Patrick on 4/25/2017.
 */
public class GarageDoorStopCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorStopCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.stop();
    }

    @Override
    public void undo() {
        garageDoor.close();
    }
}
