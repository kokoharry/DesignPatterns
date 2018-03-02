package com.kokoharry.createPatterns.singleton;

/**
 * Created by lu_yb on 2018/2/26.
 */

public class Singleton {

    /* ����˽�о�̬ʵ������ֹ�����ã��˴���ֵΪnull��Ŀ����ʵ���ӳټ��� */
    private static Singleton instance = null;

    /* ˽�й��췽������ֹ��ʵ���� */
    private Singleton() {
    }

    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new Singleton();
        }
    }

    /* ��̬���̷���������ʵ�� */
    public static Singleton getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }

    /* ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� */
    public Object readResolve() {
        return instance;
    }
}

