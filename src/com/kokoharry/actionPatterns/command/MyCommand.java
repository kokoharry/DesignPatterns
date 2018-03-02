package com.kokoharry.actionPatterns.command;

/**
 * Created by lu_yb on 2018/2/28.
 */

public class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}

