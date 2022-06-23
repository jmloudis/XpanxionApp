package com.example.nested_loops;

import java.util.Scanner;

public class NestedPractice {

    public static void multiplicationTable(){

        int sum = 0;

        for (int i = 1; i <= 12; i++){


            for (int j = 1; j <= 12; j++){

                int n = i * j;
                System.out.println(i + " x " + j + " = " + n);

            }
        }
    }

    public static void printEmptySqaure(int n)
    {
        for (int row = 0; row < n; row++)
        {
            for (int col = 0; col < n; col++)
            {
                if (row == 0 || row == n -1 || col == 0 || col == n -1 || row == col)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static void isPrimeNumber()
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        while (n <= 1)
        {
            System.out.println("Enter an integer greater than 1: ");
            n = scan.nextInt();
        }

        for (int i = 2; i <= 50; i++)
        {
            boolean isPrime = true;
            for (int j = 2; j < i; j++)
            {
                if (i % j == 0)
                {
                    isPrime = false;
                }
            }
            if (isPrime)
            {
                System.out.print(i + " ");
            }
        }
    }

    public static void tripleNestedLoop()
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                for (int k = 0; k < 5; k++)
                {
                    System.out.print("-");
                }

                System.out.print("  ");
            }
            System.out.println("");

        }

    }

    public static void quadNestedLoop()
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                for (int k = 0; k < 5; k++)
                {
                    for (int m = 0; m < 5; m++)
                    {
                        System.out.print("+");
                    }
                    System.out.print("-");
                }

                System.out.println (" j:" + j);
            }
            System.out.println(" i: " + i);

        }

    }

}
