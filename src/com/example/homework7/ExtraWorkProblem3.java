package com.example.homework7;

public class ExtraWorkProblem3 {


    public static void stairCase(int n){

        for (int i = 0; i < n; i++)
        {
            for (int j = n -1; j > i; j--)
            {
                System.out.print(" ");
            }

            for (int j = n; j >= n - i; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void boxWithMinorDiagonal(int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = n -1; j >= 0; j--)
            {
                if (i == 0 || i == n  - 1 || j == 0 || j == n -1)
                {
                    System.out.print("*");
                }
                else if (i == j){
                    System.out.print("+");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static void rightTriangle(int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                if ( j == 0 || j == i || i == n -1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void printNLetter(int n)
    {
        // 9
        for (int i = 0; i < n; i++) // 0, 1, 2
        {
            for (int j = 0; j < n; j++) // 0, 1, 2
            {
                if (j == 0 || j == n - 1 || i == j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }

    public static void fancySquare(int n)
    {

        for (int i = 0; i < n; i++)
        {

            for (int j = 0; j < n; j++)
            {

                if (i == 0 || i == n  - 1 || j == 0 || j == n -1)
                {
                    if (i == 0 && j == n - 1 || i == 0 && j == 0 || i == n -1 && j == n -1 || i == n - 1 && j == 0){
                        System.out.print("@");
                    }
                    else{
                        System.out.print("*");
                    }


                }
                else if (i == j || j == n - i - 1){

                    if (i == n / 2 && j == n / 2){
                        System.out.print("@");
                    }

                    else {
                        System.out.print("+");
                    }


                }
                else {
                    System.out.print(" ");
                }

            }

            System.out.println();

        }



    }

    public static void plusInSquare(int n)
    {
        for (int i = 0; i < n; i++)
        {

            for (int j = 0; j < n; j++)
            {

                if (i == 0 || i == n  - 1 || j == 0 || j == n -1)
                {
                    System.out.print("X");

                }
                else if (j == n /2 || i == n / 2)
                {
                    System.out.print("+");
                }
                else {
                    System.out.print(".");
                }

            }
            System.out.println();

        }
    }

    public static void boxRight(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            for (int j = n ; j >= 1; j--)
            {
                if (j == 1 || i == 1 || j == n || i == n)
                {
                    System.out.print("*");
                }
                else if ( i == j )
                {
                    System.out.print("+");
                }
                else
                {
                    System.out.print(" ");
                }


            }
            System.out.println();

        }
    }


}
