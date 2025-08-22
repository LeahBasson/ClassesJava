package testrectangle;

import java.util.Scanner;

public class TestRectangle {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        // declare variables for input.
        int cRectLength, cRectWidth;

        System.out.print("Enter the length: ");
        cRectLength = kbd.nextInt();

        System.out.print("Enter the width: ");
        cRectWidth = kbd.nextInt();

        // assign those variables to the background (class);
        Rectangle rect1 = new Rectangle(cRectLength, cRectWidth);

        rect1.show();

        System.out.println(rect1.toString());

        Rectangle rect2 = new Rectangle(cRectLength, cRectWidth);

        rect2.makeCopy(rect1);

    } // end of main

} // end of class
