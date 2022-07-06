package com.example.homework.atchaba.homework3.problem1;

import java.util.InputMismatchException;

public class SumOfDiagonals {

    public static void main(String[] args) {

            String[][] s1 = {{"2", "3", "4"},
                    {"5", "6", "7"},
                    {"8", "9", "10"}};

            String[][] s2 = {{"1", "2", "3"},
                    {"5", "6", "7"},
                    {"9", "10", "11"},
                    {"13", "14", "15"}};

            String[][] s3 = {{"1", "2", "3", "4"},
                    {"5", "6", "7", "8"},
                    {"9", "10", "11", "12"},
                    {"13", "14", "15", "16"}};

            String[][] s4 = {{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "pp"}};
            try
            {
                sumOfDiagonals(s1);
                //sumOfDiagonals(s2);
                sumOfDiagonals(s3);
                sumOfDiagonals(s4);
            }
            catch(NumberFormatException ex)
            {
                System.out.println("Not a valid integer");
            }
            catch(IllegalArgumentException ex)
            {
                System.out.println("Array not a square");
            }

    }

    public static void sumOfDiagonals(String[][] x)
    {
        int major = 0;
        int minor = 0;


        int[][] s = new int[x.length][];


        for (int i = 0; i < x.length; i++)
        {

            s[i] = new int [x[i].length];

            for (int j = 0; j < x[i].length; j++)
            {

                s[i][j] = Integer.valueOf(x[i][j]);

            }

            if (x.length == x[i].length)
            {
                major += s[i][i];
                minor += s[i][x.length - 1 -i];
            }
            else{
                throw new IllegalArgumentException();

            }

        }

        System.out.println();

        if (major == minor)
        {
            System.out.println(major);
        }
        else if (major == 0 || minor == 0){
            throw new IllegalArgumentException();
        }


    }
}
