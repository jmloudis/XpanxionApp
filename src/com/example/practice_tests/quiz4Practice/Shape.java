package com.example.practice_tests.quiz4Practice;

public class Shape
{
    private boolean isFilled;
    private String color;

    public Shape()
    {
        this.isFilled = true;
        this.color = "Green";
    }

    public Shape(boolean isFilled, String color)
    {
        this.isFilled = isFilled;
        this.color = color;
    }

    public String toString()
    {
        return "Filled: " + this.isFilled + "\n" + "Color: " + this.color;
    }
}
