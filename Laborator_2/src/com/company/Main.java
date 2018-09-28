package com.company;

public class Main {

    public static void main(String[] args) {
	Box Cutia1 = new Box();
	Box Cutia2 = new Box(6);
	Box Cutia3 = new Box(4,9,12);
	System.out.println("Area Cutia1: "+Cutia1.getArea()+";\nVolume Cutia1: "+Cutia1.getVolume()+";\n");
	System.out.println("Area Cutia2: "+Cutia2.getArea()+";\nVolume Cutia2: "+Cutia2.getVolume()+";\n");
	System.out.println("Area Cutia3: "+Cutia3.getArea()+";\nVolume Cutia2: "+Cutia3.getVolume()+";\n");
    }
}
