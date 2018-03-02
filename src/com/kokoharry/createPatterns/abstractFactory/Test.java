package com.kokoharry.createPatterns.abstractFactory;

/**
 * Created by lu_yb on 2018/2/26.
 */

public class Test {

    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.Send();
    }
}

