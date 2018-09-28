package com.company;

public class Student {
    private String Name;
    private int Age;
    private int Mark;

    public Student (String Name, int Age, int Mark){
        this.Name = Name;
        this.Age = Age;
        this.Mark = Mark;
    }
    void printStudent(){
        System.out.println("Name: "+Name+";\nAge: "+Age+";\nMark: "+Mark);
    }
    public float getMark(){
        return Mark;
    }
}
