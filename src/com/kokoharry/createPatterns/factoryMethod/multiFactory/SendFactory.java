package com.kokoharry.createPatterns.factoryMethod.multiFactory;

/**
 * Created by lu_yb on 2018/2/26.
 */

public class SendFactory {

    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }
}

