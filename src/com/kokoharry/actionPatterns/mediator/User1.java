package com.kokoharry.actionPatterns.mediator;

/**
 * Created by lu_yb on 2018/3/2.
 */

public class User1 extends User {

    public User1(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exe!");
    }
}

