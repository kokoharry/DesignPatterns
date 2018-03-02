package com.kokoharry.actionPatterns.template;

/**
 * Created by lu_yb on 2018/2/27.
 */
public class Cook_CaiXin extends Cook {
    //炒蒜蓉菜心的类

        @Override
        public void  pourVegetable(){
            System.out.println("下锅的蔬菜是菜心");
        }
        @Override
        public void  pourSauce(){
            System.out.println("下锅的酱料是蒜蓉");
        }

}
