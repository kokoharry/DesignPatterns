package com.kokoharry.actionPatterns.mediator;

/**
 * Created by lu_yb on 2018/3/2.
 */
public class User2 extends User {

    public User2(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 exe!");
    }
}
