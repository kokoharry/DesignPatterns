package com.kokoharry.createPatterns.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lu_yb on 2018/2/26.
 */

public class Builder {

    private List<Sender> list = new ArrayList<Sender>();

    public void produceMailSender(int count){
        for(int i=0; i<count; i++){
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count){
        for(int i=0; i<count; i++){
            list.add(new SmsSender());
        }
    }
}

