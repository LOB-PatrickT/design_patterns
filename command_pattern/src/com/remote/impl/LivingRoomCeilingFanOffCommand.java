package com.remote.impl;

import com.remote.Command;
import com.remote.client.CeilingFan;

/**
 * Created by Patrick on 5/2/2017.
 */
public class LivingRoomCeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public LivingRoomCeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
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
