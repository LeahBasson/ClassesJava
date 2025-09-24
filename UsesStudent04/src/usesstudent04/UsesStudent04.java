package usesstudent04;

import java.util.Arrays;
import java.util.Scanner;

public class UsesStudent04 {

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
        students[numOfStudents] = new Student(20058763, "Lee - ann Whithead",
                12000.01);
        numOfStudents++;

        //numOfStudents = 3;
        Scanner kbd = new Scanner(System.in);

//        for (int i = 0; i < 2; i++) {
//        }
        System.out.print("Enter new student's number: ");
        long cStudNr = kbd.nextLong();
        kbd.nextLine();

        System.out.print("Enter new student's name: ");
        String cStudName = kbd.nextLine();

        System.out.print("Enter new student's balance: R");
        double cStudBalance = kbd.nextDouble();

        students[numOfStudents] = new Student(cStudNr, cStudName, cStudBalance);
        //numOfStudents++;

        System.out.println("----------------------------------");
        System.out.println(Arrays.toString(students));
        System.out.println("----------------------------------");

        System.out.println("The student that owes the LEAST is: ");

        Student leastBalance = students[0];

        for (int i = 1; i < numOfStudents; i++) {
            if (students[i].getStudBalance() < leastBalance.getStudBalance()) {
                leastBalance = students[i];
            }
        }

        leastBalance.show();

    }// end of main

}// end of class
