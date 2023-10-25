package com.skymate8.module1.three;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TwoDShape> shapes = new ArrayList<>();
        shapes.add(new Triangle(5, 7, 3));
        shapes.add(new Circle(4));
        shapes.add(new Triangle(5, 6, 8));
        shapes.add(new Circle(7));
        shapes.add(new Triangle(6, 11, 14));

        for (TwoDShape shape : shapes) {
            System.out.println("Area of the shape is " + shape.getArea());
            System.out.println(shape + "\n");
        }

    }
}