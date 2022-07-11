package com.example.practice_tests.quiz4Practice;

public class Circle extends Shape
{
    private double radius;

    public Circle()
    {
        this.radius = 1;
    }
    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius, boolean isFilled, String color)
    {
        super(isFilled, color);
        this.radius = radius;
    }

    public String toString()
    {
        return "Radius: " + this.radius + "\n" + super.toString();
    }
}
