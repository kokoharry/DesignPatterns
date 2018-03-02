package com.kokoharry.actionPatterns.strategy;

/**
 * Created by lu_yb on 2018/2/27.
 */

public class Plus extends AbstractCalculator implements ICalculator {

    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"\\+");
        return arrayInt[0]+arrayInt[1];
    }
}

