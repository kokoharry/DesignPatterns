package com.kokoharry.actionPatterns.template;

/**
 * Created by lu_yb on 2018/2/27.
 */
public  abstract class Cook {
    //ģ�巽�����������Ƴ��˵����� �����˵�������һ����-���ã�
//����Ϊfinal����ϣ�����า�������������ֹ�������̵�ִ��˳�� 
    final void cookProcess(){
        //��һ��������
        this.pourOil();
        //�ڶ���������
        this.HeatOil();
        //�����������߲�
        this.pourVegetable();
        //���Ĳ�������ζ��
        this.pourSauce();
        //���岽������
        this.fry();
    }

//����ṹ����Щ���������й��̶���һ���Ŀɸ��õģ���Щ����Ҫ�������ʵ�ֵ�

    //��һ����������һ���ģ�����ֱ��ʵ��
    void pourOil(){
        System.out.println("����");
    }

    //�ڶ�����������һ���ģ�����ֱ��ʵ��
    void  HeatOil(){
        System.out.println("����");
    }

    //�����������߲��ǲ�һ���ģ�һ���°��ˣ�һ�����²��ģ�
//��������Ϊ���󷽷�������������ʵ�� 
    abstract void  pourVegetable();

    //���Ĳ�������ζ���ǲ�һ���ģ�һ����������һ���������أ�
//��������Ϊ���󷽷�������������ʵ�� 
    abstract void  pourSauce();


    //���岽��������һ���ģ�����ֱ��ʵ��
    void fry(){
        System.out.println("�������������찡");
    }
}
