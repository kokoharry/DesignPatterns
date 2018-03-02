package com.kokoharry.actionPatterns.observer;

/**
 * Created by lu_yb on 2018/2/28.
 */

public interface Subject {

    /*���ӹ۲���*/
    public void add(Observer observer);

    /*ɾ���۲���*/
    public void del(Observer observer);

    /*֪ͨ���еĹ۲���*/
    public void notifyObservers();

    /*����Ĳ���*/
    public void operation();
}

