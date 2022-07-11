package com.example.practice_tests.quiz4Replit;

public class Course
{
    private String name;
    private String level;
    private boolean active;

    public Course(String name, String level, boolean active)
    {
        this.name = name;
        this.level = level;
        this.active = active;
    }


    public String toString()
    {
        return "Course: " + this.name + "\nLevel: " + this.level + "\nActive: " + this.active;
    }
}
