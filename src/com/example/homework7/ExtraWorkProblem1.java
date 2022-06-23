package com.example.homework7;

import java.util.Scanner;

public class ExtraWorkProblem1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer n, greater than 0: ");
        int n = scan.nextInt();
        while (n <= 0){
            System.out.print("Enter an integer n, greater than 0: ");
            n = scan.nextInt();
        }

        int[] arr = new int[n];
        //ArrayList<Integer> arrList = new ArrayList<>();

        System.out.println("Array on one line: ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (int) (Math.random() * (500 -1) + 1);
            System.out.print(arr[i] + " ");
        }

        System.out.println("Maximum: " + getMax(arr));
        System.out.println("Minimum: " + getMin(arr));
        System.out.println("Sum: " + sumValues(arr));
        System.out.println("Average: " + getAverage(arr));
        System.out.println("Number of integers greater than average: " + greaterThanAverage(arr));
        System.out.println("Number of times subsequent value increases: " + countInc(arr));
        System.out.println("Number of times subsequent value decreases: " + countDec(arr));
        System.out.println("Array with 3 elements per line: ");
        printArray3PerLn(arr);




    }

    public static int getMax(int[] arr1)
    {
        int max = 0;

        for (int i = 0; i < arr1.length; i++)
        {
            int n = arr1[i];
            if (n > max)
            {
                max = n;
            }
        }
        System.out.println();
        return max;
    }

    public static int getMin(int[] arr2)
    {
        int min = arr2[0];

        for (int i = 0; i < arr2.length; i++)
        {
            int n = arr2[i];

            if (n < min)
            {
                min = n;
            }

        }
        return min;
    }

    public static int sumValues(int[] arr3)
    {
        int sum = 0;

        for (int i = 0; i < arr3.length; i++)
        {
            sum += arr3[i];
        }
        return sum;
    }

    public static double getAverage(int[] arr4)
    {
        int sum = 0;
        double avg;

        for (int i = 0; i < arr4.length; i++)
        {
            sum += arr4[i];
        }
        avg = (double) sum / arr4.length;
        return avg;
    }

    public static int greaterThanAverage(int[] arr5)
    {
        double avg = getAverage(arr5);
        int count = 0;
        for (int i = 0; i < arr5.length; i++)
        {

            if (arr5[i] > avg)
            {
                count++;
            }

        }

        return count;

    }

    public static int countInc(int[] arr6)
    {
        int count = 0;

        for (int i = 1; i < arr6.length; i++)
        {
            if (arr6[i] > arr6[i - 1])
            {
                count++;
            }
        }

        return count;
    }

    public static int countDec(int[] arr7)
    {
        int count = 0;

        for (int i = 1; i < arr7.length; i++)
        {
            if (arr7[i] < arr7[i - 1])
            {
                count++;
            }
        }

        return count;
    }


    public static void printArray3PerLn(int[] arr8)
    {
        for (int i = 0; i < arr8.length; i++)
        {
            if ((i+1) % 3 == 0)
            {
                System.out.println(arr8[i]);
            }
            else{
                System.out.print(arr8[i] + " ");
            }
        }
    }


}
