package com.kokoharry.createPatterns.factoryMethod.staticFactory;

/**
 * Created by lu_yb on 2018/2/26.
 */

public class SendFactory {

    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}

