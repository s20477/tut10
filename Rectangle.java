package com.company;

public class Rectangle implements Figure {

    double sideA;
    double sideB;

    public Rectangle ( double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getPerimeter() {
        return sideA * 2 + sideB * 2;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public String getType() {
        String type = "rectangle";
        return type;
    }
}
