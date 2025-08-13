package testCircle;

public class TestCircle {

    
    public static void main(String[] args) {
        // This is a class for Circle.
            
        // Create a Circle object with radius 10
        Circle circle = new Circle(10);

        // Display object details using toString
        System.out.println(circle.toString());

        // Display area and circumference
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());

        // Change radius to 20
        circle.setRadius(20);

        // Display updated details
        System.out.println("Updated Circle: " + circle.toString());
        System.out.println("Updated Area: " + circle.calculateArea());
        System.out.println("Updated Circumference: " + circle.calculateCircumference());
 
    }// end of main
    
}// end of class
