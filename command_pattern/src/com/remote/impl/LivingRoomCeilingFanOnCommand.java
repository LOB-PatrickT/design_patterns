package com.remote.impl;

import com.remote.Command;
import com.remote.client.CeilingFan;

/**
 * Created by Patrick on 5/2/2017.
 */
public class LivingRoomCeilingFanOnCommand implements Command {

    CeilingFan ceilingFan;
    int prevSpeed;
    public LivingRoomCeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        if(ceilingFan.getSpeed() == 0) {
            prevSpeed = ceilingFan.getSpeed();
            ceilingFan.low();
        }
        else if(ceilingFan.getSpeed() == 1) {
            prevSpeed = ceilingFan.getSpeed();
            ceilingFan.medium();
        }
        else if(ceilingFan.getSpeed() == 2){
            prevSpeed = ceilingFan.getSpeed();
            ceilingFan.high();
        }
    }

    @Override
    public void undo() {
        if(prevSpeed == 0) {
            ceilingFan.off();
        }
        else if(prevSpeed == 1) {
            ceilingFan.low();
        }
        else if(prevSpeed == 2){
            ceilingFan.medium();
        }
        else if(prevSpeed == 3){
            ceilingFan.high();
        }
    }
}

