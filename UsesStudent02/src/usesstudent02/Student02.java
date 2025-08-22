package usesstudent02;

public class Student02 {

    // attributes
    private long studNr;
    private String studName;
    private double studBalance;

    // setter and getters methods
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

    // constructor
    public Student02() {

    }

    public Student02(long studNr, String studName, double studBalance) {
        this.studNr = studNr;
        this.studName = studName;
        this.studBalance = studBalance;
    }

    public void show() {
//        getStudNr();
//        getStudName();
//        getStudBalance();
        System.out.println("Student number: " + studNr);
        System.out.println("Student name: " + studName);
        System.out.println("Outstanding balance: " + studBalance);
    }

    public void makePayment(double studPayment) {
        double total = studBalance - studPayment;
        System.out.println("New amount: " + total);
    }
} // end of class
