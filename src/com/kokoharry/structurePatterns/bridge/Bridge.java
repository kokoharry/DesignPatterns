package com.kokoharry.structurePatterns.bridge;

/**
 * Created by lu_yb on 2018/2/27.
 */

public abstract class Bridge {

    private Sourceable source;

    public void method(){
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}

