package com.company;

public class D extends C {
    protected String d;

    public D(String a,String b,String c,String d, X x){
        super(a,b,c,x);
        this.d = d;
    }

    @Override
    public String toString() {
        return "D{" +
                "d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}
