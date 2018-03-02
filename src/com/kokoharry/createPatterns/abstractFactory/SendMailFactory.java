package com.kokoharry.createPatterns.abstractFactory;

/**
 * Created by lu_yb on 2018/2/26.
 */
public class SendMailFactory implements Provider{

    @Override
    public Sender produce() {
        return new MailSender();
    }
}

