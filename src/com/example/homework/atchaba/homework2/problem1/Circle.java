package com.example.homework.atchaba.homework2.problem1;

public class Circle extends Shape {

    private double radius;

    public Circle() {
        super();
        radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, boolean isFilled, String color) {
        super(isFilled, color);
        this.radius = radius;
    }

    public double getArea()
    {
        double p = Math.PI;
        double a = p * Math.pow(radius, 2);
        return a;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString()
    {
        return "Radius: " + this.radius + "\n" + "Area: " + this.getArea() + "\n" +
                super.toString();
    }
}
