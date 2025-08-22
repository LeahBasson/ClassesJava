package usesstudent02;


import java.util.Scanner;


public class UsesStudent02 {

    
    public static void main(String[] args) {
        // must instantiate a Student object (called stud1)

        Scanner kbd = new Scanner(System.in);

        // declaring a new variable so the name needs to be different.
        long cStudNr;
        String cStudName;
        double cStudBalance;
        double studPayment;
        
        System.out.print("Enter student number: ");
        cStudNr = kbd.nextLong();

        System.out.print("Enter student name: ");
        cStudName = kbd.next();

        System.out.print("Enter outstanding balance: ");
        cStudBalance = kbd.nextDouble();

        Student02 stud1 = new Student02(cStudNr, cStudName, cStudBalance); 
        
        // to access the show() method.
        stud1.show();

        System.out.print("Please enter payment amount: ");
        studPayment = kbd.nextDouble();

        stud1.makePayment(studPayment);
        
    } // end of main
    
} // end of class
