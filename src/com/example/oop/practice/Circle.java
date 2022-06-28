package com.example.oop.practice;

public class Circle {

    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Static Method
    public static void increaseRadius(Circle c)
    {
        double rad = c.getRadius();
        rad *= 2;
        c.setRadius(rad);
    }

    // Getters and Setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
