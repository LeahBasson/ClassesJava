package usesstudent03;

import java.util.Scanner;

public class UsesStudent03 {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        // must instantiate a Student object called stud1 with the default constructor.
        Student03 stud1 = new Student03();

        long cStudNr;
        String cStudName;
        double cStudBalance;

        System.out.print("Enter 2nd student's number: ");
        cStudNr = kbd.nextLong();
        kbd.nextLine();

        System.out.print("Enter 2nd student's name: ");
        cStudName = kbd.nextLine();

        System.out.print("Enter 2nd student's outstanding balance: ");
        cStudBalance = kbd.nextDouble();

        Student03 stud2 = new Student03(cStudNr, cStudName, cStudBalance);

        System.out.println("----------------------------------------------");
        System.out.println("** Student 1 using show()");

        stud1.show();

        System.out.println("**Student 2 using toString()");
        System.out.println(stud2);
        
        System.out.print("Please enter payment amount for Student 1: R");
        double studPayment = kbd.nextDouble();
        stud1.makePayment(studPayment);
        
        System.out.println("----------------------------------------------");
        
        stud1.show();
        
    }// end of main

}// end of class
