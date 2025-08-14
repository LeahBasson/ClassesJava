package usesemployee;

public class Employee {

    // properties/attributes 
    private long empNr;
    private String empSurname;
    private double empSalary;

    // Employee Constructor
    public Employee() {
        System.out.println("I am inside constructor");
    }
    
    // second constructor - overloading adding multiple properties.
    public Employee(long nr, String surname, double sal) {
        this.empNr = nr;
        this.empSurname = surname;
        this.empSalary = sal;
    }
    
    // to access you private properties.
    // setter method (sets a value thats why we use void.) 
    // setters & getters
    public long getEmpNr() {
        return this.empNr;
    }

    public void setEmpNr(long empNr) {
        this.empNr = empNr;
    }

    public String getEmpSurname() {
        return this.empSurname;
    }

    public void setEmpSurname(String empSurname) {
        this.empSurname = empSurname;
    }

    public double getEmpSalary() {
        return this.empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

} // end of class
