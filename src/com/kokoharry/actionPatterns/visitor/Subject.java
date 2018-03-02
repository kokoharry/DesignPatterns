package com.kokoharry.actionPatterns.visitor;

/**
 * Created by lu_yb on 2018/3/2.
 */

public interface Subject {
    public void accept(Visitor visitor);
    public String getSubject();
}

