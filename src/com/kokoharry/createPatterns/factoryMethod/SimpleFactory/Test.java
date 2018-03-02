package com.kokoharry.createPatterns.factoryMethod.SimpleFactory;

/**
 * Created by lu_yb on 2018/2/26.
 */

public class Test {

    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.Send();
    }
}

