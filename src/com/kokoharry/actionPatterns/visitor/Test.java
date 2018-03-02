package com.kokoharry.actionPatterns.visitor;

/**
 * Created by lu_yb on 2018/3/2.
 */
public class Test {
    public static void main(String[] args) {

        Visitor visitor = new MyVisitor();
        Subject sub = new MySubject();
        sub.accept(visitor);
    }
}
