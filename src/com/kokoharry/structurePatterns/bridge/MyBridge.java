package com.kokoharry.structurePatterns.bridge;

/**
 * Created by lu_yb on 2018/2/27.
 */
public class MyBridge extends Bridge {
    public void method(){
        getSource().method();
    }
}
