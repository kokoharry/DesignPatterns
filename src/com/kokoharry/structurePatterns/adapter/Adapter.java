package com.kokoharry.structurePatterns.adapter;

/**
 * Created by lu_yb on 2018/2/26.
 */

public class Adapter extends Source implements Targetable {

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}

