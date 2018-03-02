package com.kokoharry.structurePatterns.decorate;

/**
 * Created by lu_yb on 2018/2/26.
 */

public class Decorator implements Sourceable {

    private Sourceable source;

    public Decorator(Sourceable source){
        super();
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("before decorator!");
        source.method();
        System.out.println("after decorator!");
    }
}

