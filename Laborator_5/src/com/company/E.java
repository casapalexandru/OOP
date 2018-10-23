package com.company;

public class E extends D {
    protected String e;

    public E(String a,String b,String c,String d,String e, X x){
        super(a,b,c,d,x);
        this.e = e;
    }

    @Override
    public String toString() {
        return "E{" +
                "e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}
