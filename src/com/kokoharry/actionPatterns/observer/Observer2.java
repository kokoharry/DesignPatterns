package com.kokoharry.actionPatterns.observer;

/**
 * Created by lu_yb on 2018/2/28.
 */

public class Observer2 implements Observer {

    @Override
    public void update() {
        System.out.println("observer2 has received!");
    }
}

