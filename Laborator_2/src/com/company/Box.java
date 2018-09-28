package com.company;

public class Box {
    private double height;
    private double widht;
    private double depth;

    public Box(){
        height = 1;
        widht = 1;
        depth = 1;
    }
    public Box( double Ident_param){
        height = Ident_param;
        widht = Ident_param;
        depth = Ident_param;
    }
    public Box(double height, double widht, double depth){
        this.height = height;
        this.widht = widht;
        this.depth = depth;
    }
    public double getArea(){
        return 2*height*widht+2*height*depth+2*widht*depth;
    }
    public double getVolume(){
        return height*widht*depth;
    }
}
