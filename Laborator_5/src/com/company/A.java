package com.company;

public class A {
    protected String a;

    public X x;

    public A(String a, X x){
        this.x = x;
        this.a = a;
    }

    public A(){
        a = "default";
    }

    @Override
    public String toString() {
        return "A{" +
                "a='" + a + '\'' +
                ", x=" + x +
                '}';
    }

    protected void printA(){
        System.out.print(">> A - Class");


    }
}
