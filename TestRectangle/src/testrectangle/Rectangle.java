package testrectangle;

public class Rectangle {

    // attributes
    private int rectLength;
    private int rectWidth;

    // setters and getters method
//    public void setRectLength(int rectLength) {
//        this.rectLength = rectLength;
//    }
    public int getRectLength() {
        return this.rectLength;
    }

//    public void setRectWidth(int rectWidth) {
//        this.rectWidth = rectWidth;
//    }
    public int getRectWidth() {
        return this.rectWidth;
    }

    // show method
    public void show() {
        System.out.println("The length is: " + rectLength);
        System.out.println("The width is: " + rectWidth);
    }

    // constructor
    public Rectangle() {
    }

    public Rectangle(int rectLength, int rectWidth) {
        this.rectLength = rectLength;
        this.rectWidth = rectWidth;
    }

    // toString method
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        String str;
        str = "Dimensions: \nLength = " + rectLength + " Width = " + rectWidth;
        return str;
    }

    public void set(int rectLength, int rectWidth) {
        this.rectLength = rectLength;
        this.rectWidth = rectWidth;
    }

    public void makeCopy(Rectangle otherRect) {
        rectLength = otherRect.getRectLength();
        rectWidth = otherRect.getRectWidth();
        System.out.println("Length: " + rectLength + "\tWidth: " + rectWidth);
    }

} // end of class
