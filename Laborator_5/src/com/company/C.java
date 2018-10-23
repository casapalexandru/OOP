package com.company;

public class C extends B {
    protected String c;

    public C(String a,String b,String c, X x){
        super(a,b,x);
        this.c = c;
    }

    @Override
    public String toString() {
        return "C{" +
                "c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}
