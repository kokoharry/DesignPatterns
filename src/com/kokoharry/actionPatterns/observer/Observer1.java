package com.kokoharry.actionPatterns.observer;

/**
 * Created by lu_yb on 2018/2/28.
 */

public class Observer1 implements Observer {

    @Override
    public void update() {
        System.out.println("observer1 has received!");
    }
}

