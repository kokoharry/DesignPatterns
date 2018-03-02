package com.kokoharry.createPatterns.factoryMethod.multiFactory;

/**
 * Created by lu_yb on 2018/2/26.
 */

public class Test {

    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        sender.Send();
    }
}

