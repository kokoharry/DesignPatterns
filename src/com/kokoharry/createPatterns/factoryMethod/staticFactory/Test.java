package com.kokoharry.createPatterns.factoryMethod.staticFactory;

/**
 * Created by lu_yb on 2018/2/26.
 */

public class Test {

    public static void main(String[] args) {
        Sender sender = SendFactory.produceMail();
        sender.Send();
    }
}

