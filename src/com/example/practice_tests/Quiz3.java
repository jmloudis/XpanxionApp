package com.example.practice_tests;

public class Quiz3 {

    private int x;
    private int y;
    private String name;

    public static int numOfObjects = 0;

    public Quiz3() {
        this.x = 0;
        this.y = 0;
        this.name = "Jordan";
        numOfObjects++;
    }

    public Quiz3(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
        numOfObjects++;
    }

    public String toString()
    {
        return "Name: " + this.name + "\n" + "Y: " + this.y + "\n" + "X: " + this.x;
    }

    public boolean equalTo(Quiz3 q)
    {
        if (this.x == q.getX() && this.y == q.getY() && this.name == q.getName())
        {
            return true;
        }
        else{
            return false;
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
