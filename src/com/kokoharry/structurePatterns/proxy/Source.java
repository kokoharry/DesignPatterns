package com.kokoharry.structurePatterns.proxy;

/**
 * Created by lu_yb on 2018/2/26.
 */

public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("the original method!");
    }
}

