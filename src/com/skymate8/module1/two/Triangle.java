package com.skymate8.module1.two;

public class Triangle extends TwoDShape {

    //Fields
    double side1;
    double side2;
    double side3;

    //Constructors
    public Triangle(double width, double height) {
        super(width, height);
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        super.height = heronsHeight();
        super.width = side1;
    }

    //Methods
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
        return "Height = " + heronsHeight() + "\nArea = " + getArea();
    }

}
