package com.kokoharry.actionPatterns.state;

/**
 * Created by lu_yb on 2018/3/2.
 */
public class Test {
    public static void main(String[] args) {

        State state = new State();
        Context context = new Context(state);

        //���õ�һ��״̬
        state.setValue("state1");
        context.method();

        //���õڶ���״̬
        state.setValue("state2");
        context.method();
    }
}
