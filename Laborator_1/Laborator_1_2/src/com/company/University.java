package com.company;

public class University {
    private String Name;
    private int FoundationYear;
    public Student[] StudentsArray;
    public int NumberofStudents = 0;

    public University (String Name, int FoundationYear){
        this.Name = Name;
        this.FoundationYear = FoundationYear;
        StudentsArray = new Student[15];
    }
    public void addStudent (Student NewStudent){
        StudentsArray[NumberofStudents] = NewStudent;
        NumberofStudents++;
    }
    public void printStudentsArray(){
        System.out.println(Name+" Students: ");
        for(int i = 0 ; i<NumberofStudents; i++){
            StudentsArray[i].printStudent();
        }
    }
    public String getName(){
        return Name;
    }
    public float getAverageMark(){
        float Media = 0;
        for(int i = 0 ; i<NumberofStudents; i++) {
            Media += StudentsArray[i].getMark();
        }
        return Media/NumberofStudents;
    }
}
