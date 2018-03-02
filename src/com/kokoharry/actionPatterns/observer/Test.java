package com.kokoharry.actionPatterns.observer;

/**
 * Created by lu_yb on 2018/2/28.
 */
public class Test {
    public static void main(String[] args) {
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());

        sub.operation();
    }
}
