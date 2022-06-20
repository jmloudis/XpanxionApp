package com.example.arrays;

import java.util.Scanner;

public class ArrayPractice {

    public static void firstDimensionArray(){
        //swap array values
        int temp;
        int[] a = {27,6,90,56,39,73,190};
        System.out.println("Before swap: ");
        System.out.println(a[2]); // 90
        System.out.println(a[4]); // 39
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println();

        // will NOT swap values - assigns a[2] value to a[4]
//        a[4] = a[2];
//        a[2] = a[4];

        // how to swap elements
        temp = a[4];
        a[4] = a[2];
        a[2] = temp;
        temp = a[1];
        a[1] = a[0];
        a[0] = temp;

        System.out.println(a[2]);
        System.out.println(a[4]);
        System.out.println(a[0]);
        System.out.println(a[1]);
    }

    public static void monthArray(){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a month number: ");
        int n = scan.nextInt();

        String[] month = {"January", "February", "March", "April", "May", "June",
              "July", "August", "September", "October", "November", "December"};

        while (n > 12){
            System.out.print("Enter a month number: ");
            n = scan.nextInt();
        }

        System.out.println(" ");
        System.out.println(month[n - 1]);
    }

    public static void arrayGreaterThan(){
        int[] arr = {3, 6, 98, 45, 10, 54, 70, 36, 91, 104};
        int size = arr.length;

        for (int i = 0; i < size; i++){
            int n = arr[i];

            if (n > 10){
                System.out.println(n);
            }
        }
    }

    public static void arrayUserInput(){

        Scanner scan = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 numbers");

        for (int i = 0; i < arr.length; i++){
            System.out.print("Enter number " + (i+1) + ": ");
            arr[i] = scan.nextInt();
        }

        System.out.println();
        System.out.println("Printing array: ");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}
