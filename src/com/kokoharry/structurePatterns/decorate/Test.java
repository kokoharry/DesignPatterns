package com.kokoharry.structurePatterns.decorate;

/**
 * Created by lu_yb on 2018/2/26.
 */
public class Test {

    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable obj = new Decorator(source);
        obj.method();
    }
}
