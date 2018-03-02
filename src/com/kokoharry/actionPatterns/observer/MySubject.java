package com.kokoharry.actionPatterns.observer;

/**
 * Created by lu_yb on 2018/2/28.
 */

public class MySubject extends AbstractSubject {

    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }

}

