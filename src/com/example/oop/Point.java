package com.example.oop;

public class Point {

    private int x;

    private int y;

    public static int numOfPoints = 0;

    public Point()
    {
        x = 0;
        y = 0;
        numOfPoints++;
    }

    public Point(int xVal, int yVal)
    {
        this.x = xVal;
        this.y = yVal;
        numOfPoints++;
    }

    // getters and setters for instance variables


    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    // setter for new values
    public void setPoint(int newX, int newY)
    {
        this.x = newX;
        this.y = newY;
    }

    // toString method
    public String toString()
    {
        return "(" + this.x + ", " + this.y + ")";
        //return "\nX: " + this.x + "\n" + "Y: " + this.y + "\n";

    }

    public double distance(Point pnt)
    {
        double result = Math.pow(this.x - pnt.getX(), 2) + Math.pow(this.y - pnt.getY(), 2);

        double dist = Math.sqrt(result);

        return dist;
    }

    public boolean valueEqual(Point p)
    {

        if ((this.x == p.getX()) && (this.y == p.getY()))
        {
            return true;
        } else {
            return false;
        }

    }

}
