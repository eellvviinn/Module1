package com.skymate8.module1.four;

public class Circle extends TwoDShape {

    //Fields
    public final double PI = Math.PI;
    private double radius;

    //Constructors
    public Circle(double radius, Colour colour) {
        super(colour);
        this.radius = radius;
    }

    //Methods

    @Override
    public double getArea() {
        double area = PI*Math.pow(radius, 2);
        return area;
    }

    @Override
    public String toString() {
        return "Radius = " + radius + "\nArea = " + getArea();
    }



}
