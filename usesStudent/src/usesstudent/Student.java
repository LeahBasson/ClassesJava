package usesStudent;

public class Student {
    // 3 attributes "private" with the datatype.
    private long studNr;
    private String name;
    private int age;

    // setter method, always has a parameter between brackets because they are receiving a value.
    // setters return type is always void. setter have a value coming in.
    public void setStudNr(long studNr) {
        // studNr is assigned to this.studNr attribute.
        this.studNr = studNr;
    }
    
    // the attribute you are assigning is the parameter
    public void setName(String name){
        this.name = name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    // Getter method
    // Getters have a value coming out. No parameters becasue its not getting anything in.
    public long getStudNr(){
        return studNr;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
}
