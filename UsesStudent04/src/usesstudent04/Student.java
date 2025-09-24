package usesstudent04;

public class Student {

    // attributes
    private long studNr;
    private String studName;
    private double studBalance;

    // constructors
    public Student() {

    }

    public Student(long studNr, String studName, double studBalance) {
        this.studNr = studNr;
        this.studName = studName;
        this.studBalance = studBalance;
    }

    // methods
    public void setStudNr(long studNr) {
        this.studNr = studNr;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public void setStudBalance(double studBalance) {
        this.studBalance = studBalance;
    }

    public long getStudNr() {
        return this.studNr;
    }

    public String getStudName() {
        return this.studName;
    }

    public double getStudBalance() {
        return this.studBalance;
    }

    public void show() {
        System.out.println("The student that owes the LEAST is:");
        
        System.out.println("Student number: " + this.studNr);
        System.out.println("Student name: " + this.studName);
        System.out.println("Outstanding balance: R" + this.studBalance);
    }

    public void makePayment(double studPayment) {
        studBalance -= studPayment;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        String content;
        content = "Student#= " + this.studNr + "| Name= " + this.studName + "| Balance= R" + this.studBalance;
        return content;
    }
}// end of class
