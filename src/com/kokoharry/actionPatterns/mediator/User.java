package com.kokoharry.actionPatterns.mediator;

/**
 * Created by lu_yb on 2018/3/2.
 */
public abstract class User {

    private Mediator mediator;

    public Mediator getMediator(){
        return mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();
}
