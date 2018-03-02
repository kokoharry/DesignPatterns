package com.kokoharry.structurePatterns.bridge;

/**
 * Created by lu_yb on 2018/2/27.
 */

public class SourceSub1 implements Sourceable {

    @Override
    public void method() {
        System.out.println("this is the first sub!");
    }
}

