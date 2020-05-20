package com.company;

public class Parallelogram implements Figure {

    public double baseSide;
    public double side;
    public double height;

    public Parallelogram(double baseSide, double side, double height) {
        this.baseSide = baseSide;
        this.side = side;
        this.height = height;
    }
    @Override
    public double getPerimeter() {
        return 2 * side + 2 *baseSide;
    }

    @Override
    public double getArea() {
        return baseSide * height;
    }

    @Override
    public String getType() {
        String type = "parallelogram";
        return type;
    }
}
