package com.kokoharry.actionPatterns.visitor;

/**
 * Created by lu_yb on 2018/3/2.
 */
public class MyVisitor implements Visitor {

    @Override
    public void visit(Subject sub) {
        System.out.println("visit the subject£º"+sub.getSubject());
    }
}
