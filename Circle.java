package com.company;

public class Circle implements Figure{

    public double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return radius * 2 * 3.14;
    }

    @Override
    public double getArea() {
        return radius * radius * 3.14;
    }

    @Override
    public String getType() {
        String type = "circle";
        return type;
    }
}
