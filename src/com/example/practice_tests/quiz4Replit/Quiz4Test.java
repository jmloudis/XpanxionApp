package com.example.practice_tests.quiz4Replit;

import com.example.practice_tests.quiz4Replit.Teacher;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Quiz4Test
{
    // Number of Teacher Tests
    @Test
    public void NumberOfTeachers()
    {
        Teacher.numberOfTeachers=0;
        Teacher teacher1 = new Teacher("java","101",true,"Teacher 1");
        assertEquals(1,teacher1.numberOfTeachers());
        Teacher teacher2 = new Teacher("java","101",true,"Teacher 2");
        assertEquals(2, teacher2.numberOfTeachers());
        System.out.println("Test Passed");

    }
}
