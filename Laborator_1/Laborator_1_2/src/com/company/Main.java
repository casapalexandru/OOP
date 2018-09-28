package com.company;

public class Main {

    public static void main(String[] args) {
	University UTM = new University("UTM", 1965);
	University ULIM = new University("ULIM", 1977);
	Student Vasilica = new Student("Vasilica Munteanu", 20, 9);
	Student Eliodor = new Student("Eliodor Popov", 22, 10);
	Student Kaha = new Student("Kaha", 21, 8);
	Student Serho = new Student("Serho", 20, 9);
    UTM.addStudent(Vasilica);
    UTM.addStudent(Eliodor);
    ULIM.addStudent(Kaha);
    ULIM.addStudent(Serho);
    UTM.printStudentsArray();
    ULIM.printStudentsArray();
    System.out.println("Average mark for "+UTM.getName()+" : "+UTM.getAverageMark());
    System.out.println("Average mark for "+ULIM.getName()+" : "+ULIM.getAverageMark());
    }
}
