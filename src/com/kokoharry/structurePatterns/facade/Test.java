package com.kokoharry.structurePatterns.facade;

/**
 * Created by lu_yb on 2018/2/27.
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
