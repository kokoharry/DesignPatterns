package com.kokoharry.actionPatterns.Interpreter;

/**
 * Created by lu_yb on 2018/3/2.
 */
public class Test {
    public static void main(String[] args) {

        // ¼ÆËã9+2-8µÄÖµ
        int result = new Minus().interpret((new Context(new Plus()
                .interpret(new Context(9, 2)), 8)));
        System.out.println(result);
    }
}
