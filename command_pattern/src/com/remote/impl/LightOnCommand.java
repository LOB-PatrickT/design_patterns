package com.remote.impl;

import com.remote.Command;
import com.remote.client.Light;

/**
 * Created by Patrick on 4/24/2017.
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
