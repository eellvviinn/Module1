package com.skymate8.module1.four;

public abstract class TwoDShape {

    //Fields
    double width;
    double height;
    Colour colour;

    //Constructors
    public TwoDShape(double width, double height) {
        this.width = width;
        this.height = height;

    }

    public TwoDShape(Colour colour) {
        this.colour = colour;
    }


    //Methods
    public abstract double getArea();

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
