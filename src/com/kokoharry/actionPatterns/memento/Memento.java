package com.kokoharry.actionPatterns.memento;

/**
 * Created by lu_yb on 2018/3/2.
 */
public class Memento {

    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}