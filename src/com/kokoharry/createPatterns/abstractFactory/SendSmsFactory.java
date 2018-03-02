package com.kokoharry.createPatterns.abstractFactory;

/**
 * Created by lu_yb on 2018/2/26.
 */
public class SendSmsFactory implements Provider{

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}

