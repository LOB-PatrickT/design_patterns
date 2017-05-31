package com.facade.main;

import com.facade.impl.Amplifier;
import com.facade.impl.CdPlayer;
import com.facade.impl.HomeTheaterFacade;

/**
 * Created by Patrick on 5/28/2017.
 */
public class StartHomeTheater {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        CdPlayer cdPlayer = new CdPlayer();
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade.Builder()
                .addAmplifier(amplifier)
                .addCdPlayer(cdPlayer)
                .build();

        homeTheaterFacade.getAmplifier().operate();
        homeTheaterFacade.getCdPlayer().operate();

    }
}
