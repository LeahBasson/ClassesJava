package usesemployee;

import java.util.Scanner;

public class UsesEmployee {

    public static void main(String[] args) {
        // create an instance of the employee class.

//        Employee emp1 = new Employee(123, "Jacobs", 2300.50);
//
//        System.out.println("Employee Number: " + emp1.getEmpNr());
//        System.out.println("Employee Surname: " + emp1.getEmpSurname());
//        System.out.println("Employee Salary: " + emp1.getEmpSalary());
//
//        emp1.setEmpSalary(200000);
//        System.out.println(emp1.getEmpSurname() + " Salary is now " + emp1.getEmpSalary());;
        Scanner kbd = new Scanner(System.in);

        // Employee emp1 =new Employee();
        long cEmpNr;
        String cEmpSurname;
        double cEmpSalary, cEmpSalary2;

        System.out.print("Enter employee number: ");
        cEmpNr = kbd.nextLong();

        System.out.print("Enter employee surname: ");
        cEmpSurname = kbd.next();

        System.out.print("Enter employee salary: ");
        cEmpSalary = kbd.nextDouble();

        Employee emp1 = new Employee(cEmpNr, cEmpSurname, cEmpSalary);
//          emp1.setEmpNr(cEmpNr);
//          emp1.setEmpSurname(cEmpSurname);
//          emp1.setEmpSalary(cEmpSalary);

        System.out.println("emp 1 employee number: " + emp1.getEmpNr());
        System.out.println("emp 1 employee surname: " + emp1.getEmpSurname());
        System.out.println("emp 1 employee salary: " + emp1.getEmpSalary());
 
        System.out.print("Enter employee salary: ");
        cEmpSalary = kbd.nextDouble();
      
        //Employee emp2 = new Employee();
        emp1.setEmpSalary(cEmpSalary);
        System.out.println("Employee " + emp1.getEmpSurname() + " salary has been increased to R" + emp1.getEmpSalary());

    } // end of main

} // end of class
