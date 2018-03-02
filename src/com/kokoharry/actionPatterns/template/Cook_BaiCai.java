package com.kokoharry.actionPatterns.template;

/**
 * Created by lu_yb on 2018/2/27.
 */
public class Cook_BaiCai extends Cook {
    //炒手撕包菜的类
        @Override
        public void  pourVegetable(){
            System.out.println("下锅的蔬菜是包菜");
        }
        
        @Override
        public void  pourSauce(){
            System.out.println("下锅的酱料是辣椒");
        }
}
