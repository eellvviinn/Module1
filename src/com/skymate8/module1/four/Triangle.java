package com.skymate8.module1.four;
/**
 * Represents a triangle
 */
public class Triangle extends TwoDShape implements Rotate {
    // These are not initialized if the constructor Triangle(double width, double height, Colour colour) is called
    //Fields
    double side1;
    double side2;
    double side3;
    double angle = 360;
    /**
     * Creates a triangle with the given width, height and colour
     *
     * @param width  the width of the triangle
     * @param height the height of the triangle
     * @param colour the colour of the triangle
     */
    //Constructors
    public Triangle(double width, double height) {
        super(width, height);
    }
    /**
     * Creates a triangle with the given sides and colour
     *
     * @param side1  the first side of the triangle
     * @param side2  the second side of the triangle
     * @param side3  the third side of the triangle
     * @param colour the colour of the triangle
     */
    public Triangle(double side1, double side2, double side3, Colour colour) {
        // Let this.side1 be the width of the triangle and heronsHeight to be its height
        super(colour);
        // These need to come before heronsHeight is called because it uses them
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        // Manually assign base and height;
        super.height = heronsHeight();
        super.width = side1;
    }

    //Methods
    /**
     * Get the height of the triangle using Heron's formula <a href="https://www.youtube.com/watch?v=a1PR9O1Va84">https://www.youtube.com/watch?v=a1PR9O1Va84</a>
     *
     * @return the height of the triangle
     */
    private double heronsHeight() {
        double s = (side1 + side2 + side3) / 2.0;
        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        double height = ((area/0.5)/side1);
        return height;
    }

    @Override
    public double getArea() {
        double area = (side1*height)/2;
        return area;
    }

    @Override
    public String toString() {
        return "Height = " + heronsHeight() + "\nBase = " + side1 + "\nArea = " + getArea();
    }

    @Override
    public void rotate(double degrees) {
        angle += degrees;
    }

    @Override
    public void rotate90() {
        rotate(90);
    }

    @Override
    public void rotate180() {
        rotate(180);
    }
}
