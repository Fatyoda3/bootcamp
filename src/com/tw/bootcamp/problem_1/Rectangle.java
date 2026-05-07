package com.tw.bootcamp.problem_1;

public class Rectangle {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;

    }

    public double calculateArea() {
        return this.width * this.height;
    }
}
