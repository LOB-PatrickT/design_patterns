package com.remote.impl;

import com.remote.Command;
import com.remote.client.Light;

/**
 * Created by Patrick on 4/29/2017.
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
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
