package com.remote.impl;

import com.remote.Command;
import com.remote.client.GarageDoor;
import com.remote.client.Light;

/**
 * Created by Patrick on 4/25/2017.
 */
public class GarageDoorLightOffCommand implements Command {

    Light light;

    public GarageDoorLightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
