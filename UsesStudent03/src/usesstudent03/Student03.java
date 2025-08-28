package usesstudent03;

public class Student03 {

    // attibutes
    private long studNr;
    private String studName;
    private double studBalance;

    // constructors
    public Student03() {
        // System.out.println("No student datails.");
        studNr = 230146740;
        studName = "Leah Basson";
        studBalance = 10000;
    }

    public Student03(long studNr, String studName, double studBalance) {
        this.studNr = studNr;
        this.studName = studName;
        this.studBalance = studBalance;
    }

    // methods
    public void setStudNr(long studNr) {
        this.studNr = studNr;
    }

    public long getStudNr() {
        return this.studNr;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getStudName() {
        return this.studName;
    }

    public void setStudBalance(double studBalance) {
        this.studBalance = studBalance;
    }

    public double studBalance() {
        return this.studBalance;
    }

    public void show() {
        System.out.println("Student number: " + studNr);
        System.out.println("Student name: " + studName);
        System.out.println("Outstanding balance: " + studBalance);
    }

    public void makePayment(double studPayment) {
        double total = studBalance - studPayment;
        System.out.println("Final amount: " + total);
    }

//    @Override
//    public String toString(){
//        
//        return "Student# = " + studNr + " | Name = " + studName + " | Balance = R" + studBalance;
//    }
    @Override
    public String toString() {
        String details;
        details = "Student# = " + studNr + " | Name = " + studName + " | Balance = R" + studBalance;
        return details;
    }
} // end of class
