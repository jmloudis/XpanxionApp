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
            avg = (double) total / arr.length;

        }

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
}
