package com.kokoharry.actionPatterns.Interpreter;

/**
 * Created by lu_yb on 2018/3/2.
 */

public class Minus implements Expression {

    @Override
    public int interpret(Context context) {
        return context.getNum1()-context.getNum2();
    }
}

