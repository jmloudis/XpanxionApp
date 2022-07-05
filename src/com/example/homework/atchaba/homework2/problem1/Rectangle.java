package com.example.homework.atchaba.homework2.problem1;

public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle() {
        super();
        length = 2;
        width = 1;
    }

    public Rectangle(double width, double length, boolean isFilled, String color)
    {
        super(isFilled, color);
        this.width = width;
        this.length = length;
        setLW(this.width, this.length);
    }

    public void setLW(double x, double y)
    {

        if (x > y)
        {
            this.length = x;
            this.width = y;
        }
        else
        {
            this.length = y;
            this.width = x;
        }

    }

    public double getArea()
    {
        double a = width * length;
        return a;
    }

    public String toString()
    {
        return "Width: " + this.width + "\n" + "Length: " + this.length +"\n"
                + "Area: " + getArea() + "\n" + super.toString();
    }
}
