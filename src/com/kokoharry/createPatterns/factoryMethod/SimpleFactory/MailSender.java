package com.kokoharry.createPatterns.factoryMethod.SimpleFactory;

/**
 * Created by lu_yb on 2018/2/26.
 */

public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is mailsender!");
    }
}

