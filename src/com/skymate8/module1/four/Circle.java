package com.skymate8.module1.four;
/**
 * Represents a circle
 */
public class Circle extends TwoDShape {

    //Fields
    public final double PI = Math.PI;
    private double radius;
    /**
     * Create a circle with the given radius and colour
     *
     * @param radius the radius of the circle
     * @param colour the colour of the circle
     */
    //Constructors
    public Circle(double radius, Colour colour) {
        super(colour);
        this.radius = radius;
    }
    /**
     * Get the area of the circle, using the formula PI * radius^2
     *
     * @return the area of the circle
     */
    //Methods

    @Override
    public double getArea() {
        double area = PI*Math.pow(radius, 2);
        return area;
    }
    /**
     * Get the string representation of the circle, including all of its fields
     *
     * @return the string representation of the circle
     */
    @Override
    public String toString() {
        return "Radius = " + radius + "\nArea = " + getArea();
    }



}
