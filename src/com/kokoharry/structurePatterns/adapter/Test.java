package com.kokoharry.structurePatterns.adapter;

import com.kokoharry.createPatterns.factoryMethod.staticFactory.SendFactory;
import com.kokoharry.createPatterns.factoryMethod.staticFactory.Sender;

/**
 * Created by lu_yb on 2018/2/26.
 */

public class Test {

    public static void main(String[] args) {
            Targetable target = new Adapter();
            target.method1();
            target.method2();
    }
}

