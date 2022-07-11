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
                sumOfDiagonalsOption2(s2);
                sumOfDiagonalsOption2(s3);
                sumOfDiagonalsOption2(s4);
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


        // Create a new 2d int array
        int[][] s = new int[x.length][];


        // for loop for the amount of array rows
        for (int i = 0; i < x.length; i++)
        {

            // set row size in int array to same length of rows as String array
            s[i] = new int [x.length];

            //
            for (int j = 0; j < x[i].length; j++)
            {

                // convert String values to same position in int array
                s[i][j] = Integer.valueOf(x[i][j]);

            }


            // see if 2d array has same size row and columns
            if (x.length == x[i].length)
            {
                major += s[i][i]; //
                //minor += s[i][x.length - 1 -i];
            }
            else
            {
                throw new IllegalArgumentException();
            }

        }

        System.out.println(major);
        System.out.println();

        // if both diagonals have the same sum , print out sum
        if (major == minor)
        {
            System.out.println(major);
        }
        else if (major == 0 || minor == 0){
            throw new IllegalArgumentException();
        }


    }

    public static void sumOfDiagonalsOption2(String[][] arr)
    {
        if (arr.length != arr[0].length)
            throw new IllegalArgumentException();
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum = sum + Integer.parseInt(arr[i][i]);
        System.out.println("Sum of major diagonal elements: " + sum);

    }



}

