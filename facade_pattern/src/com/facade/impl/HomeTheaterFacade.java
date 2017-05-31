package com.facade.impl;

/**
 * Created by Patrick on 5/27/2017.
 */
public class HomeTheaterFacade {

    private Amplifier amplifier;
    private Tuner tuner;
    private DvdPlayer dvdPlayer;
    private CdPlayer cdPlayer;
    private Projector projector;
    private TheaterLights theaterLights;
    private Screen screen;
    private PopcornPopper popcornPopper;

    private HomeTheaterFacade() {}

    public Amplifier getAmplifier() {
        return amplifier;
    }

    public Tuner getTuner() {
        return tuner;
    }

    public DvdPlayer getDvdPlayer() {
        return dvdPlayer;
    }

    public CdPlayer getCdPlayer() {
        return cdPlayer;
    }

    public Projector getProjector() {
        return projector;
    }

    public TheaterLights getTheaterLights() {
        return theaterLights;
    }

    public Screen getScreen() {
        return screen;
    }

    public PopcornPopper getPopcornPopper() {
        return popcornPopper;
    }

    public static class Builder {

        private HomeTheaterFacade homeTheaterFacade;

        public Builder() {
            homeTheaterFacade = new HomeTheaterFacade();
        }

        public HomeTheaterFacade build() {
            return homeTheaterFacade;
        }

        public Builder addAmplifier(Amplifier amplifier) {
            homeTheaterFacade.amplifier = amplifier;
            return this;
        }

        public Builder addCdPlayer(CdPlayer cdPlayer) {
            homeTheaterFacade.cdPlayer = cdPlayer;
            return this;
        }

        public Builder addDvdPlayer(DvdPlayer dvdPlayer) {
            homeTheaterFacade.dvdPlayer = dvdPlayer;
            return this;
        }

        public Builder addPopcornPopper(PopcornPopper popcornPopper) {
            homeTheaterFacade.popcornPopper = popcornPopper;
            return this;
        }

        public Builder addProjector(Projector projector) {
            homeTheaterFacade.projector = projector;
            return this;
        }

        public Builder addScreen(Screen screen) {
            homeTheaterFacade.screen = screen;
            return this;
        }

        public Builder addTheaterLights(TheaterLights theaterLights) {
            homeTheaterFacade.theaterLights = theaterLights;
            return this;
        }

        public Builder addTuner(Tuner tuner) {
            homeTheaterFacade.tuner = tuner;
            return this;
        }
    }
}
