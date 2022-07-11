package com.example.practice_tests.quiz4Replit;

public class Teacher extends Course
{
    private String teacherName;
    public static int numberOfTeachers;

    public Teacher()
    {
        super("n/a", "n/a", false);
        teacherName = "n/a";
        numberOfTeachers++;
    }

    public Teacher(String name, String level, boolean active, String teacherName)
    {
        super(name,level,active);
        this.teacherName = teacherName;
        numberOfTeachers++;
    }

    public String getTeacherName()
    {
        return teacherName;
    }

    public void setTeacherName(String teacherName)
    {
        this.teacherName = teacherName;
    }

    public int numberOfTeachers()
    {
        return numberOfTeachers;
    }

    public boolean equals(Object obj)
    {
        Teacher t1 = (Teacher) obj;

        if (this.teacherName.equals(t1.getTeacherName()))
        {
            return true;
        }
        else{
            return false;
        }
    }

    public String toString()
    {
        return super.toString() + "\nTeacher: " + this.teacherName;
    }
}
