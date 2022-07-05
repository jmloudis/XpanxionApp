package com.example.quiz;

public class Kid {

    // instance variables
    private String name;
    private String gender;
    private int age;

    // static variable
    public static int numberOfKids = 0;

    // No-arg constructor
    public Kid() {
        this.name = "Jean-Marc";
        this.gender = "Male";
        this.age = 18;
        numberOfKids++;
    }

    // overloaded constructor - 3 parameters
    public Kid (String name, String gender, int age)
    {
        this.name = name;
        this.gender = gender;
        this.age = age;
        numberOfKids++;
    }

    // getter methods
    public String getName()
    {
        return this.name;
    }

    public String getGender()
    {
        return this.gender;
    }

    public int getAge()
    {
        return this.age;
    }

    // setter methods
    public void setName(String name)
    {
        this.name = name;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    // toString method
    public String toString()
    {
        return "Name: " + this.name + "\n" + "Gender: " + this.gender + "\n" + "Age: " + this.age + "\n";
    }

    // object equality method
    public boolean areTheyTwins(Kid kid)
    {
        if (this.age == kid.getAge())
        {
            return true;
        }
        else{
            return false;
        }
    }


}
