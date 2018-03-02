package com.kokoharry.actionPatterns.command;

/**
 * Created by lu_yb on 2018/2/28.
 */
public class Test {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command cmd = new MyCommand(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}
