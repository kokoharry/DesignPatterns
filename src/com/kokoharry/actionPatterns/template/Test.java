package com.kokoharry.actionPatterns.template;

/**
 * Created by lu_yb on 2018/2/27.
 */
public class Test {
    public static void main(String[] args){
//�� - ��˺����
        Cook_BaiCai BaoCai = new Cook_BaiCai();
        BaoCai.cookProcess();

//�� - ���ز���
        Cook_CaiXin CaiXin = new Cook_CaiXin();
        CaiXin.cookProcess();
    }

}
