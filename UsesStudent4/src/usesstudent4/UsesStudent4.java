package usesstudent4;

import java.util.Scanner;

public class UsesStudent4 {

    public static void main(String[] args) {
        // instantiate an array of 10 Student objects and call the array students.
        // The first 3 elements must be hard-coded with values.
        // new student must be prompted for, read in and then stored into the 4th element.
        int numOfStudents = 0;
        Student[] students = new Student[10];

        students[numOfStudents] = new Student(9258403, "Jeff Smith", 10000.01);
        numOfStudents++;
        students[numOfStudents] = new Student(9122468, "John Joseph", 500.01);
        numOfStudents++;
        students[numOfStudents] = new Student(20058763, "Lee - ann Whithead", 12000.01);
        numOfStudents++;

        //numOfStudents = 3;

        Scanner kbd = new Scanner(System.in);

//        for (int i = 0; i < 2; i++) {
//        }

        System.out.print("Enter new student's number: ");
        long cStudNr = kbd.nextLong();

        System.out.print("Enter new student's name: ");
        String cStudName = kbd.next();

        System.out.print("Enter new student's balance: ");
        double cStudBalance = kbd.nextDouble();

        students[numOfStudents] = new Student(cStudNr, cStudName, cStudBalance);
        numOfStudents++;

    }// end of main

}// end of class
