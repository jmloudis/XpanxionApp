package com.example.arrays;

import java.util.Scanner;

public class Homework6 {

    public static void problem1(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter integer n, greater than 0: ");
        int n = scan.nextInt();


        // If number is less than or equal to 0, ask user to input number greater than 0
        while (n <= 0){
            System.out.print("Enter integer n, greater than 0: ");
            n = scan.nextInt();
        }

        // ask user to input array values for size entered.
        int[] arr = new int[n];
        System.out.print("Enter " + n + " integers: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();
        }

        // initialize variables
        int max = arr[0];
        int min = arr[0];
        double avg = 0;
        int total = 0;

        // print out array values
        System.out.println();
        System.out.print("You entered: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +  " ");

            // get maximum value in array
            if (arr[i] > max){
                max = arr[i];
            }

            // get minimum value in array
            if (arr[i] < min){
                min = arr[i];
            }


            // get total sum in array and find average
            // by dividing by array length
            total += arr[i];


        }

        avg = (double) total / arr.length;

        System.out.println();
        System.out.println();
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        System.out.println("Average: " + avg);

        // print array values greater than average
        System.out.println();
        System.out.println("Elements greater than average: ");
        for(int i = 0; i < arr.length; i++){

            if (arr[i] > avg){
                System.out.print(arr[i] + " ");
            }

        }

        // print array values greater than last index
        System.out.println();
        System.out.println("Elements greater than " + arr[arr.length - 1] + ": ");
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > arr[arr.length - 1]){
                System.out.print(arr[i] + " ");
            }
        }

        // print array in reverse order
        System.out.println();
        System.out.println("Array in reverse order: ");
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }


    }

    public static void problem3(){
        int[] arr = {2,3,9,17,32,40,73,40,21,10};

        System.out.println("Before Shifting: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        int temp = arr[0];
        for (int i = 1; i < arr.length; i++){
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;

        System.out.println();
        System.out.println();
        System.out.println("After shifting: ");
        for ( int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void problem4(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter integer n greater than 10: ");
        int n = scan.nextInt();
        int temp;

        while (n <= 10){
            System.out.print("Enter integer n greater than 10: ");
            n = scan.nextInt();
        }

        int[] arr = new int[n];


        System.out.println("Before swap: ");
        for (int i = 0; i < arr.length; i++){
            int m = (int) (Math.random() * (75 - 2)) + 2;
            arr[i] = m;
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        int sum = arr[2] + arr[5] + arr[7] + arr[9];
        System.out.println("Sum of elements at indexes 2, 5, 7 and 9 is: " + sum);

        temp = arr[2];
        arr[2] = arr[6];
        arr[6] = temp;
        temp = arr [4];
        arr[4] = arr[7];
        arr[7] = temp;

        System.out.println();
        System.out.println("After swap: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sum = arr[2] + arr[5] + arr[7] + arr[9];
        System.out.println("Sum of elements at indexes 2, 5, 7 and 9 is: " + sum);

    }
}
