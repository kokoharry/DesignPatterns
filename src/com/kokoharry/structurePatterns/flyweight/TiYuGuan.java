package com.kokoharry.structurePatterns.flyweight;

/**
 * Created by lu_yb on 2018/2/27.
 */
public class TiYuGuan implements JianZhu {
    private String name;
    private String shape;
    private String yundong;
    public TiYuGuan(String yundong){
        this.setYundong(yundong);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getShape() {
        return shape;
    }
    public void setShape(String shape) {
        this.shape = shape;
    }
    public String getYundong() {
        return yundong;
    }
    public void setYundong(String yundong) {
        this.yundong = yundong;
    }
    @Override
    public void use() {
        System.out.println("�������ݱ�ʹ�����ٿ����˻�" + "  �˶�Ϊ��"+ yundong+"  ��״Ϊ��"+shape+ "  ����Ϊ��"+name);
    }
}