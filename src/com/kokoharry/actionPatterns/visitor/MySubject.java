package com.kokoharry.actionPatterns.visitor;

/**
 * Created by lu_yb on 2018/3/2.
 */

public class MySubject implements Subject {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }
}

