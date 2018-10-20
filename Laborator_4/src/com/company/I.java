package com.company;

public class I extends H {
    protected String i;

    public I(String a, String b, String c, String d, String e, String f, String g, String h,String i, X x) {
        super(a, b, c, d, e, f, g,h, x);
        this.i = i;
    }

    @Override
    public String toString() {
        return "I{" +
                "i='" + i + '\'' +
                ", h='" + h + '\'' +
                ", g='" + g + '\'' +
                ", f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}
