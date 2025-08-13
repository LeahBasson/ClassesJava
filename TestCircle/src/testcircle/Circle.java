
package testCircle;


public class Circle {
    // attribute
    private int radius;
   
    // constructors
    // No argument constructor - sets radius to a default value. 
    public Circle (){
        this.radius = 0;
    }
            
    
    // Argument constructor - accepts a radius value and assigns it.
    public Circle(int radius){
        this.radius = radius;
    }
    
    
    // setter method
    public void setRadius(int radius){
        this.radius = radius;
    }
    
    // getter method
    public int getRadius(){
        return radius;
    }
    
    // method to display radius
    public void show(){
        System.out.println("Circle with radius: " + radius);
    }
    
    // toString Method
    public String toString(){
        return "Circle [radius =" + radius + "]";
    }
    
    // method to calculate area
    public double calculateArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    
    // method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    
}
