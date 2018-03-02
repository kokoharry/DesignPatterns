package com.kokoharry.actionPatterns.mediator;

/**
 * Created by lu_yb on 2018/3/2.
 */
public class Test {
    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
