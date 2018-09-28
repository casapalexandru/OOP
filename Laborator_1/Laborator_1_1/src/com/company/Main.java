package com.company;

public class Main {

    public static void main(String[] args) {
        Monitors Lenovo = new Monitors("Lenovo", "ThinkVisionLI2264d", "Black", 22, "1920x1080");
        Monitors Lenovo2 = new Monitors("Lenovo", "ThinkVisionLI2264d", "Black", 22, "1920x1080");
        Monitors Asus = new Monitors("Asus", "S24D300H", "Black", 22, "1920x1080");
        Monitors Philips = new Monitors("Philps", "272S4LPJCB", "Black", 27, "2560 x 1440");
        Monitors Dell = new Monitors("Dell", "Alienware AW2518HF", "Black", 25, "1920 x 1080");
        System.out.println("Monitors list:");
        Lenovo.print();
        Asus.print();
        Philips.print();
        Dell.print();
        System.out.println(Lenovo.equals(Dell));
        if (Lenovo.isEqual(Lenovo2)) {
            System.out.println("Monitors is equal!");
        }else{System.out.println("Monitors is not equal!");}

    }
}
