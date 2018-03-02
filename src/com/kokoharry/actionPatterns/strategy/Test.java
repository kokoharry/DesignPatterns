package com.kokoharry.actionPatterns.strategy;

/**
 * Created by lu_yb on 2018/2/27.
 */
public class Test {
    public static void main(String[] args) {
        String exp = "2+8";
        ICalculator cal = new Plus();
        int result = cal.calculate(exp);
        System.out.println(result);
    }
}
