package com.remote;

/**
 * Created by Patrick on 4/24/2017.
 */
public interface Command {
    public void execute();

    public void undo();
}
