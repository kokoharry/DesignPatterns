package com.kokoharry.actionPatterns.chainOfResponsibility;

/**
 * Created by lu_yb on 2018/2/28.
 */

public abstract class AbstractHandler {

    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

}

