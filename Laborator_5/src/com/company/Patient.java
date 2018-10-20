package com.company;

public class Patient extends Person {
    protected String id;
    protected int age;
    protected String acceptedDate;
    protected String sicknessHistory;
    protected String prescription;
    protected String allergies;
    protected String specialReqs;

    public Patient(String id,String FullName,String gender,String birthDate,int age,String acceptedDate,String sicknessHistory,String prescription,String allergies,String specialReqs){
        super(FullName,gender,birthDate);
        this.id = id;
        this.age = age;
        this.acceptedDate = acceptedDate;
        this.sicknessHistory = sicknessHistory;
        this.prescription = prescription;
        this.allergies = allergies;
        this.specialReqs = specialReqs;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id='" + id + '\'' +
                ", FullName='" + FullName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", birthDate='" + birthDate + '\'' +
                ", acceptedDate='" + acceptedDate + '\'' +
                ", sicknessHistory='" + sicknessHistory + '\'' +
                ", allergies='" + allergies + '\'' +
                ", specialReqs='" + specialReqs + '\'' +
                ", prescription='" + prescription + '\'' +
                '}';
    }
}

