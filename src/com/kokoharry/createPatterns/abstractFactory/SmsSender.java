package com.kokoharry.createPatterns.abstractFactory;

/**
 * Created by lu_yb on 2018/2/26.
 */
public class SmsSender implements Sender {

    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}
