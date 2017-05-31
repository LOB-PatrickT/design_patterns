package com.remote.action;

import com.remote.Command;
import com.remote.MacroCommand;
import com.remote.client.CeilingFan;
import com.remote.client.GarageDoor;
import com.remote.client.Light;
import com.remote.impl.*;

/**
 * Created by Patrick on 4/24/2017.
 */
public class RemoteControlUser {
    private static RemoteControl remoteControl = new RemoteControl();
    private static GarageDoor garageDoor = new GarageDoor();
    private static Command[] onCommands;
    private static Command[] offCommands;

    private RemoteControlUser() {}

    public static void main(String[] args) {

        CeilingFan ceilingFan = new CeilingFan("Living Room");
        LivingRoomCeilingFanOnCommand livingRoomFanOn = new LivingRoomCeilingFanOnCommand(ceilingFan);
        LivingRoomCeilingFanOffCommand livingRoomFanOff = new LivingRoomCeilingFanOffCommand(ceilingFan);

        Light light = new Light("Basic Light");
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        light = new Light("Garage Light");
        GarageDoorLightOnCommand garageDoorLightOn = new GarageDoorLightOnCommand(light);
        GarageDoorLightOffCommand garageDoorLightOff = new GarageDoorLightOffCommand(light);

        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);

        onCommands = new Command[]{livingRoomFanOn, lightOn, garageDoorOpen, garageDoorLightOn};
        offCommands = new Command[]{livingRoomFanOff, lightOff, garageDoorClose, garageDoorLightOff};

        MacroCommand macroOn = new MacroCommand(onCommands);
        MacroCommand macroOff = new MacroCommand(offCommands);

        remoteControl.setCommand(0, macroOn, macroOff);

        remoteControl.pressOnButton(0);
        System.out.println(remoteControl.toString());
        remoteControl.pressOffButton(0);
    }


}
