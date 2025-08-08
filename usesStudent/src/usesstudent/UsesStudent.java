package usesStudent;

import java.util.Scanner;


public class UsesStudent {

    
    public static void main(String[] args) {
        // This is a class for Student.
        
        Scanner kbd = new Scanner(System.in);
        
        Student stud1 = new Student();
        long cStudNr;
        String cName;
        int cAge;
        
        System.out.print("Enter student number: ");
        cStudNr = kbd.nextLong();
        
        System.out.print("Enter student name: ");
        cName = kbd.next();
        
        System.out.print("Enter student age: ");
        cAge = kbd.nextInt();
        
        stud1.setStudNr(cStudNr);
        stud1.setName(cName);
        stud1.setAge(cAge);
        
        // if the value doesnt return properly then the setter was incorrect.
        System.out.println("stud1 student number: " + stud1.getStudNr());
        System.out.println("stud1 student name: " + stud1.getName());
        System.out.println("stud1 student age: " + stud1.getAge());
        
    } // end of main
    
} // end of class
