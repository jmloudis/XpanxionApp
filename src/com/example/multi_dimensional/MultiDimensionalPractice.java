package com.example.multi_dimensional;

import java.util.Scanner;

public class MultiDimensionalPractice {

    public static void findSum()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an number: ");
        int n = scan.nextInt();

        int[][] arr = new int[n][n];

        int sum = 0;
        int leftToRight = 0;
        int rightToLeft = 0;

        for (int row = 0; row < arr.length; row++)
        {
            for (int col = 0; col < arr[row].length; col++)
            {
                arr[row][col] = (int) (Math.random() * (100 -1) + 1);
            }
        }

        for (int row = 0; row < arr.length; row++)
        {

            leftToRight += arr[row][row];
            rightToLeft += arr[row][arr.length - 1 - row];

            for (int col = 0; col < arr[row].length; col++)
            {
                System.out.print(arr[row][col] + " ");

                sum += arr[row][col];
            }
            System.out.println();


        }
        System.out.println();
        System.out.println("Sum: " + sum);

        System.out.println("Left To Right: " + leftToRight);
        System.out.println("Right To Left: " + rightToLeft);


    }


    public static void findMax()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter amount of rows: ");
        int n = scan.nextInt();
        System.out.print("Enter amount of columns: ");
        int m = scan.nextInt();

        int[][] arr = new int[n][m];
        int max = 0;

        for (int row = 0; row < arr.length; row++)
        {
            for (int col = 0; col < arr[row].length; col++)
            {
                arr[row][col] = (int) (Math.random() * (100 -1) + 1);
            }
        }

        for (int row = 0; row < arr.length; row++)
        {
            for (int col = 0; col < arr[row].length; col++)
            {
                System.out.print(arr[row][col] + " ");

                if (arr[row][col] > max)
                {
                    max = arr[row][col];
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Max num: " + max);

    }
}
